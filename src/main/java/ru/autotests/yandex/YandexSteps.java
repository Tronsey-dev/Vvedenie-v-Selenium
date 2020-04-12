package ru.autotests.yandex;

import ru.autotests.utils.*;
import ru.yandex.qatools.allure.annotations.Step;

public class YandexSteps {

    private YandexPage yandexPage;

    @Step("Переход на страницу Яндекса: {0}")
    public void goToUrl(String url) {
        yandexPage = new YandexPage();
        if (!BaseSteps.getDriver().getCurrentUrl().equals(url)) {
            yandexPage.goToUrl(url);
        }
    }

    @Step("Открытие страницы Маркета")
    public void clickOnMarket() {
        yandexPage.clickOnMarket();
    }

    @Step("Нажатие на Электроника")
    public void clickOnElectron() {
        yandexPage.clickOElectron();
    }

    @Step("Нажатие на Телевизоры")
    public void clickOnTv() {
        yandexPage.clickOnTv();
    }

    @Step("Нажатие на Все фильтры")
    public void clickOnFilters() {
        yandexPage.clickOnFilters();
    }

    @Step("Переключение на страницу Маркета")
    public void switchPageOnMarket() {
        yandexPage.switchPageOnMarket();
    }

    @Step("Заполнение минимальной цены значением {0}")
    public void fillMinPrice(String s) {
        yandexPage.fillMinPrice(s);
    }

    @Step("Выбор производителей телевизоров")
    public void clickTvFilters() {
        yandexPage.clickTvFilters();
    }

    @Step("Нажатие кнопки Применить и ожидание загрузки страницы {0}")
    public void clickResAndWait(String name) {
        yandexPage.clickResAndWait(name);
    }

    @Step("Получение списка телевизоров и сравнение его длины")
    public String getTvList(String xpath) {
        return yandexPage.getTvListAndCheckLength(xpath);
    }

    @Step("Заполняем Поиск значением {0}")
    public void fillSearch(String firstRes) {
        yandexPage.fillSearch(firstRes);
    }

    @Step("Нажатие кнопки Найти и проверка результата")
    public void clickOnSearch(String firstRes, String xpath) {
        yandexPage.clickObSearchBtn(firstRes, xpath);
    }

    @Step("Нажатие на Наушники")
    public void clickOnHeadset() {
        yandexPage.clickOnHeadset();
    }

    @Step("Выбор производителей наушников")
    public void clickOnHeadSetFilters() {
        yandexPage.clickOnHeadSetFilters();
    }

    @Step("Получение списка наушников и сравнение его длины")
    public String getHeadsetList(String className) {
        return yandexPage.getHeadsetList(className);
    }

    @Step("Закрытие вкладки Маркет")
    public void closeMarketTab() {
        yandexPage.closeMarketTab();
    }
}
