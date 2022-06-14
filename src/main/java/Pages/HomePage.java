package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private  WebDriver driver;
    private By SignInLink = By.linkText("Sign in");
    private By CreateAnAccountButton = By.xpath("CreateAnAccountButton");

    public HomePage(WebDriver driver){
        this.driver = driver;
        driver.get("http://automationpractice.com/index.php?");
    }

    public CreateAccountPage clickSignIn() {
        driver.findElement(SignInLink).click();
        return new CreateAccountPage(driver);
    }

    public CreateAccountPage clickCreateAnAccount() {
        driver.findElement(CreateAnAccountButton).click();
        return new CreateAccountPage(driver);
    }
}
