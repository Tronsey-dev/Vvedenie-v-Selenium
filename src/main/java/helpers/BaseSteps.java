package helpers;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Attachment;

import java.util.Properties;

public class BaseSteps {
    public static Properties properties = TestProperties.getINSTANCE().getProperties();
    public static WebDriver driver;
    public static Wait<WebDriver> wait;

    @Before
    public void setUp() {
        switch (properties.getProperty("browser")) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver", properties.getProperty("webdriver.gecko.driver"));
                driver = new FirefoxDriver();
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));
                driver = new ChromeDriver();
                break;
        }
        wait = new WebDriverWait(driver, 5, 5000);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void fill(By a, String b) {
        driver.findElement(a).click();
        driver.findElement(a).sendKeys(b);
    }

    public static void fill(WebElement a, String b) {
        a.click();
        a.sendKeys(b);
    }

    public static WebElement findElement(String id) {
        return driver.findElement(By.id(id));
    }

    public static void clickFor(WebElement a) {
        a.click();
    }

    public static void waitText(By a, String b) {
        wait.until(ExpectedConditions.textToBe(a, b));
        Assert.assertEquals(driver.findElement(a).getText(), b);
    }

    public static void waitText(WebElement a, String b) {
        wait.until(ExpectedConditions.textToBePresentInElement(a, b));
        Assert.assertEquals(a.getText(), b);
    }

    public static void waitClick(WebElement a) {
        wait.until(ExpectedConditions.elementToBeClickable(a)).click();
    }

    public static void waitClickNoClick(WebElement a) {
        wait.until(ExpectedConditions.elementToBeClickable(a));
    }

    @Attachment(type = "image/png", value = "Screenshot")
    public static byte[] takeScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @AfterClass
    public static void after() {
        driver.quit();
    }

}
