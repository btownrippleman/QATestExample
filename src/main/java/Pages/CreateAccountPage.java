package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage {


    private By setpasswrd;
    private WebDriver driver;
    private By CreateAnAccountButton = By.partialLinkText("CreateAnAccount");

    public CreateAccountPage(WebDriver driver) {

    }

    public CreateAccountPage clickCreateAccount() {
        driver.findElement(CreateAnAccountButton).click();
        return new CreateAccountPage(driver);

    }

    public void setEmailaddress(String emailaddress) {
        By EmailaddressField = null;
        driver.findElement(EmailaddressField).sendKeys(emailaddress);
    }

//    public void setpasswrd(String password, Object String) {
//         driver.findElement(password).sendKeys((CharSequence) passwrd);
//       }

    public String getinfoAccountText() {
        return null;
    }
}

