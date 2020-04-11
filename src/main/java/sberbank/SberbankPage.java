package sberbank;

import helpers.BaseSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

	public void clickOnInsurance(){
		buttonInsurance.click();
	}

}



