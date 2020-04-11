package helpers; /**
 * Общие методы
 */
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class BaseTest {
    protected static WebDriver driver;
    Wait<WebDriver> wait;
       public static Properties properties = TestProperties.getINSTANCE().getProperties();

    public BaseTest() {
          this.wait = new WebDriverWait(driver, 5, 5000);
    }

    protected void fill(By a, String b) {
        driver.findElement(a).click();
        driver.findElement(a).sendKeys(b);
    }
    protected void fill(WebElement a, String b) {
        a.click();
        a.sendKeys(b);
    }

    protected void clickFor(WebElement a) {
       a.click();
    }

    protected void waitText(By a, String b) {
        wait.until(ExpectedConditions.textToBe(a, b));
        Assert.assertEquals(driver.findElement(a).getText(), b);
    }
    protected void waitText(WebElement a, String b) {
        wait.until(ExpectedConditions.textToBePresentInElement(a, b));
        Assert.assertEquals(a.getText(), b);
    }

    protected void waitClick(WebElement a) {
        wait.until(ExpectedConditions.elementToBeClickable(a)).click();
    }
    protected void waitClickNoClick(WebElement a) {
        wait.until(ExpectedConditions.elementToBeClickable(a));
    }

    @BeforeClass
    public static void setUp()  {
        switch (properties.getProperty("browser")) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver", properties.getProperty("webdriver.gecko.driver"));
                driver = new FirefoxDriver();
            case "chrome":
                System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));
                driver = new ChromeDriver();
        }
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

 @AfterClass
    public static void After() {
     driver.quit();
 }
}
