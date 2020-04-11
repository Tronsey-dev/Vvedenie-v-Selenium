package yandex;

import helpers.BaseSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class YandexPage {

	@FindBy(xpath = "//*[normalize-space(text()) = 'Маркет']")
	private WebElement market;

	@FindBy(xpath = "//noindex/div/div/div/div[2]/div/div[1]/div[3]/div")
	private WebElement electronics;

	@FindBy(xpath = "//div[3]/div[2]/ul/li[1]/div/a")
	private WebElement tv;

	@FindBy(xpath = "//div[2]/div[2]/ul/li[1]/div/a")
	private WebElement headset;

	@FindBy(xpath = "//*[normalize-space(text()) = 'Все фильтры']")
	private WebElement allFilters;

	@FindBy(id = "glf-pricefrom-var")
	private WebElement minPrice;

	@FindBy(xpath = "//*[normalize-space(text()) = 'Samsung']")
	private WebElement tvFilter1;

	@FindBy(xpath = "//*[normalize-space(text()) = 'LG']")
	private WebElement tvFilter2;

	@FindBy(xpath = "//*[normalize-space(text()) = 'Beats']")
	private WebElement headsetFilter;

	@FindBy(xpath = "//div[5]/div/div[1]/*/a[2]")
	private WebElement lookRez;

	@FindBy(id = "header-search")
	private WebElement search;

	@FindBy(xpath = "/html/body/div[2]/div[2]/noindex/div/div/div[2]/div/div[1]/form/span/span[2]/button")
	private WebElement searchBut;

	@FindBy(xpath = "//div[2]/div/div/div[1]/h1")
	private WebElement header;

	public YandexPage() {
		PageFactory.initElements(BaseSteps.getDriver(), this);
	}

	public void goToUrl(String url) {
		BaseSteps.getDriver().get(url);
		BaseSteps.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		BaseSteps.getDriver().manage().window().maximize();

	}
}
