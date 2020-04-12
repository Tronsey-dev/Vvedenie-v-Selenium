package ru.autotests.sberbank;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.HashMap;
import java.util.Map;

public class SberbankScenarioSteps {

    SberbankSteps sberbankSteps = new SberbankSteps();

    @When("^выбран базовый урл Сбербанка\"(.+)\"$")
    public void goToUrl(String baseUrl) {
        sberbankSteps.goToUrl(baseUrl);
    }

    @And("^нажатие на – Страхование")
    public void clickOnInsurance() {
        sberbankSteps.clickOnInsurance();
    }

    @And("^выбрать – Страхование путешественников")
    public void clickOnListButton() {
        sberbankSteps.clickOnListButton();
    }

    @And("^выбрать – Оформить онлайн")
    public void clickOnOnline() {
        sberbankSteps.clickOnOnline();
    }

    @And("^выберите сумму страховой защиты - Минимальная")
    public void clickOnButtonMinSum() {
        sberbankSteps.clickOnButtonMinSum();
    }

    @And("^нажать кнопку Оформить")
    public void clickOnButtonRegister() {
        sberbankSteps.clickOnButtonRegister();
    }

    @Then("^ожидание загрузки страницы страхования и поля \"(.+)\"$")
    public void waitInsuranceTextLoad(String fieldName) {
        sberbankSteps.waitTextLoad("//form/div/fieldset[2]/legend",fieldName);
    }

    @When("^заполняются поля:$")
    public void fillForm(DataTable fields) {
        sberbankSteps.fillFields(fields.asMap(String.class, String.class));
    }

    @And("^нажать кнопку Пол")
    public void clickOnMale() {
        sberbankSteps.clickOnMale();
    }

    @And("^нажать кнопку Продолжить")
    public void clickOnFinalBtn() {
        sberbankSteps.clickOnFinalBtn();
    }

    @And("^ожидание загрузки страницы и поля \"(.+)\"$")
    public void waitFinalTextLoad(String text) {
        sberbankSteps.waitTextLoad("//alert-form[1]/div", text);
    }

}
