package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By EmailaddressField = By.id("Email Address");
    private By passwdField = By.name("Password");
    private By submitButton = By.id("SubmitLogin");
    private By CreateAnAccountButton = By.id("CreateAnAccount");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmailaddress(String emailaddress){
        driver.findElement(EmailaddressField).sendKeys(emailaddress);
    }

    public void setPasswd(String passwd){
        driver.findElement(passwdField).sendKeys(passwd);
    }


}
