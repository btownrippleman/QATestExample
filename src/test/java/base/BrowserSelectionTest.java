package base;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;


public class BrowserSelectionTest {
    protected HomePage homepage;
    protected WebDriver driver;


    public WebDriver StartBrowser(String browsername) {
        // ---If the browser is Firefox----
        if (browsername.equalsIgnoreCase("Firefox")) {
            // Set the path for geckodriver.exe
            System.setProperty("webdriver.firefox.marionette","resources/geckodriver.exe");
            driver = new FirefoxDriver();
            HomePage homePage = new HomePage(driver);
            driver.get("http://automationpractice.com/index.php?");
        }
        //---- If the browser is Chrome--
        else if (browsername.equalsIgnoreCase("Chrome")) {
            // Set the path for chromedriver.exe
            // System.setProperty("webdriver.chrome.driver", "resources/selenium-chrome-driver-4.1.2.jar");
            driver = new ChromeDriver();
            HomePage homePage = new HomePage(driver);
            driver.get("http://automationpractice.com/index.php?");
        }
        // ----If the browser is  Edge----
        else if (browsername.equalsIgnoreCase("Edge")) {
            // Set the path for MSEdgedriver
            System.setProperty("webdriver.edge.driver", "resources/msedgedriver.exe");
            // Instantiate a EdgeDriverclass.
            EdgeOptions options = new EdgeOptions();
            driver = new EdgeDriver(options);
            HomePage homePage = new HomePage(driver);
            driver.get("http://automationpractice.com/index.php?");
        }

        driver.manage().window().maximize();
        return driver;


    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
