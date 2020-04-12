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
        textForForm.put("surname_vzr_ins_0", "Surname");
        textForForm.put("name_vzr_ins_0", "Name");
        textForForm.put("birthDate_vzr_ins_0", "20021980");
        sberbankSteps.fillFields(textForForm);

        sberbankSteps.clickOnMale();

        Map<String, String> textForForm2 = new HashMap<>();
        textForForm2.put("person_lastName", "ФамилияГражданина");
        textForForm2.put("person_firstName", "ИмяГражданина");
        textForForm2.put("person_middleName", "ОтчествоГражданина");
        textForForm2.put("person_birthDate", "20021982");

        textForForm2.put("passportSeries", "1234");
        textForForm2.put("passportNumber", "567890");
        textForForm2.put("documentDate", "20022000");
        textForForm2.put("documentIssue", "ОДВ вселенной по рукаву Ориона");
        sberbankSteps.fillFields(textForForm2);

        sberbankSteps.clickOnFinalBtn();
        sberbankSteps.waitTextLoad("//alert-form[1]/div", "При заполнении данных произошла ошибка");

    }

}