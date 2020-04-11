package tests;

import helpers.BaseSteps;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;
import sberbank.SberbankSteps;

import java.util.HashMap;
import java.util.Map;

public class TaskTest extends BaseSteps {
    private static final String baseUrl = "https://www.sberbank.ru/ru/person";

    @Test
    @Title("Страхование от Сбербанка")
    public void TaskOne() {
        SberbankSteps sberbankSteps = new SberbankSteps();
        sberbankSteps.goToUrl(baseUrl);
        sberbankSteps.clickOnInsurance();

        sberbankSteps.clickOnListButton();
        sberbankSteps.clickOnOnline();
        sberbankSteps.clickOnButtonMinSum();
        sberbankSteps.clickOnButtonRegister();

        sberbankSteps.waitTextLoad("//form/div/fieldset[2]/legend", "Страхователь");
        Map<String, String> textForForm = new HashMap<>();
        textForForm.put("surname_vzr_ins_0", "Фамилия");
        textForForm.put("name_vzr_ins_0", "Имя");
        textForForm.put("birthDate_vzr_ins_0", "20021980");
        sberbankSteps.fillFields(textForForm);

        sberbankSteps.clickOnMale();

        textForForm.clear();
        textForForm.put("person_lastName", "Фамилия2");
        textForForm.put("person_firstName", "Имя2");
        textForForm.put("person_middleName", "Отчество");
        textForForm.put("person_birthDate", "20021980");
        textForForm.put("passportSeries", "1234");
        textForForm.put("passportNumber", "567890");
        textForForm.put("documentDate", "20021982");
        textForForm.put("documentIssue", "ОДВ вселенной по рукаву Ориона");
        sberbankSteps.fillFields(textForForm);

        sberbankSteps.clickOnFinalBtn();
        sberbankSteps.waitTextLoad("//alert-form[1]/div", "При заполнении данных произошла ошибка");

    }

}