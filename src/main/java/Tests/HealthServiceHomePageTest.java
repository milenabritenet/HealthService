package Tests;
import Pages.SeleniumHelper;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.PropertiesFile;
import java.io.IOException;


public class HealthServiceHomePageTest extends BaseSeleniumTest {
public static String url;

    @Test
    public void HealthServiceTest() throws IOException {
        PropertiesFile.readPropertiesFile();

        driver.get(url);
        String expectedTitle = "Health Service";
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),expectedTitle);
        SeleniumHelper.takeScreenshot(driver);
    }

}
