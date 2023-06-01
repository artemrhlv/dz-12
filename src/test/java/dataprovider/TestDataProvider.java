package dataprovider;

import org.dz9.Man;
import org.dz9.Woman;
import org.testng.annotations.DataProvider;

public class TestDataProvider {

    @DataProvider(name = "man")
    public static Object[][] man() {
        return new Object[][]{{"Igor", "Petrov", 27}};
    }

    @DataProvider(name = "partnership")
    public static Object[][] partnership() {
        return new Object[][]{{new Man("Viktor", "Koval", 32), new Woman("Lera", "Honcharuk", 70)}};
    }
}
