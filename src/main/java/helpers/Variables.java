package helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Variables extends BaseTest {

    @FindBy(xpath = "//ul/li[6]/button/span")
    protected WebElement buttonInsurance;

    @FindBy(xpath = "//div[2]/div/div[1]/ul/li[6]/div/div/div/div[1]/ul/li[2]/a")
    protected WebElement listButtonInsurance;

    @FindBy(xpath = "//div/div[7]/div/a/b")
    protected WebElement buttonApplyOnline;

    @FindBy(xpath = "//fieldset[6]/div/div[1]/online-card-program/div")
    protected WebElement buttonMinSum;

    @FindBy(xpath = "//div/form/div/div[1]/div/button")
    protected WebElement buttonRegister;

    @FindBy(xpath = "//div[5]/div/form-control-label/div/radio-button-group/div/div/label[1]")
    protected WebElement buttonMale;

    @FindBy(xpath = "//div/div[2]/button")
    protected WebElement finalButton;

    @FindBy(xpath = "//*[normalize-space(text()) = 'Маркет']")
    protected WebElement market;

    @FindBy(xpath = "//noindex/div/div/div/div[2]/div/div[1]/div[3]/div")
    protected WebElement electronics;

    @FindBy(xpath = "//div[3]/div[2]/ul/li[1]/div/a")
    protected WebElement tv;

    @FindBy(xpath = "//div[2]/div[2]/ul/li[1]/div/a")
    protected WebElement headset;

    @FindBy(xpath = "//*[normalize-space(text()) = 'Все фильтры']")
    protected WebElement allFilters;

    @FindBy(id = "glf-pricefrom-var")
    protected WebElement minPrice;

    @FindBy(xpath = "//*[normalize-space(text()) = 'Samsung']")
    protected WebElement tvFilter1;

    @FindBy(xpath = "//*[normalize-space(text()) = 'LG']")
    protected WebElement tvFilter2;

    @FindBy(xpath = "//*[normalize-space(text()) = 'Beats']")
    protected WebElement headsetFilter;

    @FindBy(xpath = "//div[5]/div/div[1]/*/a[2]")
    protected WebElement lookRez;

    @FindBy(id = "header-search")
    protected WebElement search;

    @FindBy(xpath = "/html/body/div[2]/div[2]/noindex/div/div/div[2]/div/div[1]/form/span/span[2]/button")
    protected WebElement searchBut;



    @FindBy(xpath = "//div[2]/div/div/div[1]/h1")
    protected WebElement Header;

    public Variables() {
        PageFactory.initElements(driver, this);
    }
}
