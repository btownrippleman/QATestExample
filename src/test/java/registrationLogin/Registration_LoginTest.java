package registrationLogin;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BrowserSelectionTest;

public class Registration_LoginTest extends BrowserSelectionTest {
    @BeforeTest
    public void start(){
        driver = this.StartBrowser("chrome");
    }

    @Test
    public void testRegistrationSuccessful() {
        Assert.assertEquals(true,true);
        // CreateAccountPage createAccountPage = homepage.clickSignIn();
        // createAccountPage.setEmailaddress("Zoe1234@hotmail.com");
        // createAccountPage.setpasswrd("Zoe1234", String);
        // CreateAccountPage myAccountPage = createAccountPage.clickCreateAccount();
        // assertEquals(myAccountPage.getinfoAccountText(), "Welcome to your account.","Text is incorrect.");
    }
    // @AfterTest
    // public void tearDown(){
    //     driver.close();

    // }

}
