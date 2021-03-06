package Tests;

import Pages.SeleniumHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public abstract class BaseSeleniumTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.out.println("Starting the Test");
        String driverPath = "C:\\Users\\BRITENET\\Downloads\\gs-accessing-data-mysql-master\\HealthServiceTests\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void teardown() throws InterruptedException, IOException {
        SeleniumHelper.takeScreenshot(driver);
        System.out.println("Ending the Test");
        Thread.sleep(3000);
        driver.quit();
    }
}
