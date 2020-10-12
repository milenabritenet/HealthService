package Tests;
import Pages.DoctorsList;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.PropertiesFile;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
public class DoctorListTest extends BaseSeleniumTest {

    public static String url;

    @Test
public void DoctorListTest() throws IOException {
        PropertiesFile.readPropertiesFile();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        DoctorsList doctorsList = new DoctorsList(driver);
        doctorsList.getDoctorsBtn().click();
        String expectedTitle = "Doctors";
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),expectedTitle);

}
}


//comment