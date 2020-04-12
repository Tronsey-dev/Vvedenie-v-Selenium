package yandex;

import helpers.BaseSteps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
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

    @FindBy(xpath = "//*[contains(text(),'Найти')]")
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

    public void clickOnMarket() {
        BaseSteps.waitClick(market);
    }

    public void switchPageOnMarket() {
        ArrayList<String> Tabs = new ArrayList<>(BaseSteps.getDriver().getWindowHandles());
        BaseSteps.getDriver().switchTo().window(Tabs.get(1));
    }

    public void clickOElectron() {
        BaseSteps.waitClick(electronics);
    }

    public void clickOnTv() {
        BaseSteps.waitClick(tv);
    }

    public void clickOnFilters() {
        BaseSteps.waitClick(allFilters);
        BaseSteps.waitText(By.xpath("//div[4]/div/h1"), "Все фильтры");
    }


    public void fillMinPrice(String s) {
        BaseSteps.fill(minPrice, s);
    }

    public void clickTvFilters() {
        tvFilter1.click();
        tvFilter2.click();
    }

    public void clickResAndWait(String name) {
        BaseSteps.waitClick(lookRez);
        BaseSteps.waitText(header, name);
        BaseSteps.waitClickNoClick(BaseSteps.driver.findElement(By.xpath("//div[3]/div[1]/div[2]/div/div[1]/div[1]/div[4]/div[1]/h3/a")));
    }

    public String getTvListAndCheckLength(String xpath) {
        List<WebElement> listRez = BaseSteps.findElementsByXpath(xpath);
        Assert.assertEquals(String.format("Получено значение [%s]. Ожидалось [%s]", listRez.size(), 48), 48, listRez.size());
        return listRez.get(0).getText();
    }

    public void fillSearch(String firstRes) {
        BaseSteps.fill(search, firstRes);
    }

    public void clickObSearchBtn(String firstRes,String xpath) {
        BaseSteps.waitClick(searchBut.findElement(By.xpath("./..")));
        BaseSteps.waitClickNoClick(xpath);
        WebElement foundElement = BaseSteps.findElementByXpath(xpath);
        Assert.assertEquals(String.format("Получено значение [%1s]. Ожидалось [%2s]", foundElement.getText(), firstRes), firstRes, foundElement.getText());
    }

    public void clickOnHeadset() {
        headset.click();
    }

    public void clickOnHeadSetFilters() {
        headsetFilter.click();
    }

    public String getHeadsetList(String className) {
        List<WebElement> listRez = BaseSteps.findElementsByClassName(className);
        Assert.assertEquals(String.format("Получено значение [%1s]. Ожидалось [%2s]", listRez.size(), 24), 24, listRez.size());
        return listRez.get(0).getText();
    }
}
