package testfolder;

import org.dz9.Man;
import org.dz9.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonTests {

    @Test(dataProvider = "man", dataProviderClass = dataprovider.TestDataProvider.class)
    public void testPersonRetired(String firstName, String lastName, int age) {
        Man man = new Man(firstName, lastName, age);
        Boolean retiredActual = man.isRetired();
        Boolean retiredExpected = (age >= 65);
        Assert.assertEquals(retiredActual, retiredExpected, "Retired test is failed");
    }

    @Test(dataProvider = "partnership", dataProviderClass = dataprovider.TestDataProvider.class)
    public void testRegisterPartnership(Man person1, Woman person2) {
        person2.setPartner(person1);
        person2.registerPartnership();
        Assert.assertEquals(person2.getLastName(), person1.getLastName(), "RegisterPartnership test is failed");
    }

    @Test(dataProvider = "partnership", dataProviderClass = dataprovider.TestDataProvider.class)
    public void testDeregisterPartnership(Man person1, Woman person2) {
        person2.setPartner(person1);
        person2.registerPartnership();
        person2.deregisterPartnership();
        Assert.assertEquals(person2.getLastName(), person2.getOldLastName(), "DeregisterPartnership test is failed");
    }

}
