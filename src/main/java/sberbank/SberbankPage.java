package sberbank;

import helpers.BaseSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class SberbankPage {

    @FindBy(xpath = "//ul/li[6]/button/span")
    private WebElement buttonInsurance;

    @FindBy(xpath = "//div[2]/div/div[1]/ul/li[6]/div/div/div/div[1]/ul/li[2]/a")
    private WebElement listButtonInsurance;

    @FindBy(xpath = "//div/div[7]/div/a/b")
    private WebElement buttonApplyOnline;

    @FindBy(xpath = "//fieldset[6]/div/div[1]/online-card-program/div")
    private WebElement buttonMinSum;

    @FindBy(xpath = "//div/form/div/div[1]/div/button")
    private WebElement buttonRegister;

    @FindBy(xpath = "//div[5]/div/form-control-label/div/radio-button-group/div/div/label[1]")
    private WebElement buttonMale;

    @FindBy(xpath = "//div/div[2]/button")
    private WebElement finalButton;

    public SberbankPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void goToUrl(String url) {
        BaseSteps.getDriver().get(url);
        BaseSteps.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        BaseSteps.getDriver().manage().window().maximize();
    }

    public void clickOnInsurance() {
        buttonInsurance.click();
    }

    public void clickOnListButton() {
        BaseSteps.waitClick(listButtonInsurance);
    }

    public void clickOnOnline() {
        BaseSteps.waitClick(buttonApplyOnline);
    }

    public void clickOnButtonMinSum() {
        BaseSteps.waitClick(buttonMinSum);
    }

    public void clickOnButtonRegister() {
        BaseSteps.waitClick(buttonRegister);
    }

    public void waitTextLoad(String xpath, String text) {
        BaseSteps.waitText(By.xpath(xpath), text);
    }

    public WebElement findElement(String id) {
        return BaseSteps.findElement(id);
    }

    public void fillTextField(WebElement field, String value) {
        BaseSteps.fill(field, value);
    }

    public void clickOnMale() {
        BaseSteps.clickFor(buttonMale);
    }

    public void clickOnFinalBtn() {
        BaseSteps.clickFor(finalButton);
    }
}



