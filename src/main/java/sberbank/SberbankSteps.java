package sberbank;


import org.openqa.selenium.WebElement;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.Map;

public class SberbankSteps {

    private SberbankPage sberbankPage = new SberbankPage();

    @Step("Переход на страницу Сбербанка: {0}")
    public void goToUrl(String url) {
        sberbankPage.goToUrl(url);
    }

    @Step("Нажатие на – Страхование")
    public void clickOnInsurance() {
        sberbankPage.clickOnInsurance();
    }

    @Step("Выбрать – Страхование путешественников")
    public void clickOnListButton() {
        sberbankPage.clickOnListButton();
    }

    @Step("Выбрать – Оформить онлайн")
    public void clickOnOnline() {
        sberbankPage.clickOnOnline();
    }

    @Step("Выберите сумму страховой защиты - Минимальная")
    public void clickOnButtonMinSum() {
        sberbankPage.clickOnButtonMinSum();
    }

    @Step("Нажать кнопку Оформить")
    public void clickOnButtonRegister() {
        sberbankPage.clickOnButtonRegister();
    }

    @Step("Ожидание загрузки страницы")
    public void waitTextLoad(String xpath, String text) {
        sberbankPage.waitTextLoad(xpath, text);
    }

    @Step("Заполнение полей формы")
    public void fillFields(Map<String, String> textForForm) {
        for (Map.Entry<String, String> entry : textForForm.entrySet()) {
            String id = entry.getKey();
            String value = entry.getValue();
            fillField(value, sberbankPage.findElement(id));
        }
    }

    @Step("Заполнение значением: {0}")
    public void fillField(String value, WebElement field) {
        sberbankPage.fillTextField(field, value);
    }

    @Step("Нажать кнопку Пол")
    public void clickOnMale() {
        sberbankPage.clickOnMale();
    }

    @Step("Нажать кнопку Продолжить")
    public void clickOnFinalBtn() {
        sberbankPage.clickOnFinalBtn();
    }

}
