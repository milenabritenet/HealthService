package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DoctorsList {

    @FindBy(linkText = "Doctors")
    private WebElement doctorsBtn;


    public DoctorsList (WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public WebElement getDoctorsBtn() {
        return doctorsBtn;
    }
}

