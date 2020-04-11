package helpers;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;

public class BaseSteps {
	public static Properties properties = TestProperties.getINSTANCE().getProperties();
	protected static WebDriver driver;
	private static Wait<WebDriver> wait;

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
		this.wait = new WebDriverWait(driver, 5, 5000);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	@AfterClass
	public static void after() {
		driver.quit();
	}

	public void fill(By a, String b) {
		driver.findElement(a).click();
		driver.findElement(a).sendKeys(b);
	}

	public void fill(WebElement a, String b) {
		a.click();
		a.sendKeys(b);
	}

	public void clickFor(WebElement a) {
		a.click();
	}

	public void waitText(By a, String b) {
		wait.until(ExpectedConditions.textToBe(a, b));
		Assert.assertEquals(driver.findElement(a).getText(), b);
	}

	public void waitText(WebElement a, String b) {
		wait.until(ExpectedConditions.textToBePresentInElement(a, b));
		Assert.assertEquals(a.getText(), b);
	}

	public static void waitClick(WebElement a) {
		wait.until(ExpectedConditions.elementToBeClickable(a)).click();
	}

	public void waitClickNoClick(WebElement a) {
		wait.until(ExpectedConditions.elementToBeClickable(a));
	}
}
