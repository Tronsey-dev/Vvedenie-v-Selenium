package ru.autotests.yandex;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class YandexScenarioSteps {

    YandexSteps yandexSteps = new YandexSteps();

    @When("^выбран базовый урл Яндекса\"(.+)\"$")
    public void goToUrl(String baseUrl) {
        yandexSteps.goToUrl(baseUrl);
    }

    @When("^нажатие на – Маркет")
    public void clickOnMarket() {
        yandexSteps.clickOnMarket();
    }

    @When("^переключиться на вкладку - Маркет")
    public void switchPageOnMarket() {
        yandexSteps.switchPageOnMarket();
    }

    @When("^выбрать – Электроника")
    public void clickOnElectron() {
        yandexSteps.clickOnElectron();
    }

    @When("^выбрать – Телевизоры")
    public void clickOnTv() {
        yandexSteps.clickOnTv();
    }

    @When("^выбрать – Наушники")
    public void clickOnHeadset() {
        yandexSteps.clickOnHeadset();
    }

    @When("^нажать кнопку Все фильтры")
    public void clickOnFilters() {
        yandexSteps.clickOnFilters();
    }

    @When("^заполнен фильтр Минимальная цена значением \"(.+)\"$")
    public void fillMinPrice(String price) {
        yandexSteps.fillMinPrice(price);
    }

    @When("^выбор производителей телевизоров")
    public void clickTvFilters() {
        yandexSteps.clickTvFilters();
    }

    @When("^выбор производителей наушников")
    public void clickOnHeadSetFilters() {
        yandexSteps.clickOnHeadSetFilters();
    }

    @When("^нажатие кнопки Применить и ожидание загрузки страницы \"(.+)\"$")
    public void clickResAndWait(String page) {
        yandexSteps.clickResAndWait(page);
    }

    @When("^заполнение Поиска телевизоров значением и поиск")
    public void fillTvSearch() {
        String firstRes = yandexSteps.getTvList("//div[3]/div[1]/div[2]/div/div[1]//div[4]/div[1]/h3/a");
        yandexSteps.fillSearch(firstRes);
        yandexSteps.clickOnSearch(firstRes,"//div[3]/div[1]/div[2]/div/div[1]/div[1]/div[4]/div[1]/h3/a");
    }

    @When("^заполнение Поиска наушников значением и поиск")
    public void fillHeadsetSearch() {
        String firstRes = yandexSteps.getHeadsetList("n-snippet-card2__title");
        yandexSteps.fillSearch(firstRes);
        yandexSteps.clickOnSearch(firstRes, "/html/body/div[2]/div[5]/div[3]/div[1]/div[2]/div/div[1]//div[4]/div[1]/h3/a");
    }

    @Then("^закрытие вкладки Маркет")
    public void closeMarketTab() {
        yandexSteps.closeMarketTab();
    }
}
