package helpers;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Attachment;

import java.util.List;
import java.util.Properties;

public class BaseSteps {
    public static Properties properties = TestProperties.getINSTANCE().getProperties();
    public static WebDriver driver;
    public static Wait<WebDriver> wait;

    @BeforeClass
    public static void setUp() {
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
        wait = new WebDriverWait(driver, 10, 5000);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static List<WebElement> findElementsByXpath(String xpath) {
        return driver.findElements(By.xpath(xpath));
    }

    public static List<WebElement> findElementsByClassName(String className) {
        return driver.findElements(By.className(className));
    }


    public static void fill(WebElement a, String b) {
        a.click();
        a.clear();
        a.sendKeys(b);
    }

    public static WebElement findElementById(String id) {
        return driver.findElement(By.id(id));
    }

    public static WebElement findElementByXpath(String xpath) {
        return driver.findElement(By.xpath(xpath));
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

    public static void elementIsPresents(WebElement a) {
        wait.until(ExpectedConditions.elementToBeClickable(a));
    }

    public static void elementIsPresents(String xpath) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }

    @Attachment(type = "image/png", value = "Скриншот об ошибке")
    public static byte[] takeScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @AfterClass
    public static void after() {
        driver.quit();
    }

}
