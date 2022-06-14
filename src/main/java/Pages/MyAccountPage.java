package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {

    private WebDriver driver;
    private static By SigninButton = By.className("My account");
    private By MyAccountWelcomeText = By.name("Welcome to your account.");

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }
    public By getinfoAccountText(WebDriver driver) {
        return MyAccountPage.SigninButton;

    }

    public String getinfoAccountText() {
        return null;
    }

    private class SigninButton {
    }

    // public (WebDriver driver);

    //dresses/printed dress
}
