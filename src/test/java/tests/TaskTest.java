package tests;

import helpers.Variables;
import org.junit.*;
import org.openqa.selenium.By;

public class TaskTest extends Variables {
    private static final String baseUrl = "https://www.sberbank.ru/ru/person";

    @Test
    public void TaskOne() {
        driver.get(baseUrl);
        waitClick(buttonInsurance);
        waitClick(listButtonInsurance);
        waitClick(buttonApplyOnline);
        waitClick(buttonMinSum);
        waitClick(buttonRegister);
        waitText(By.xpath("//form/div/fieldset[2]/legend"), "Страхователь");
        fill(By.id("surname_vzr_ins_0"), "Фамилия");
        fill(By.id("name_vzr_ins_0"), "Имя");
        fill(By.id("birthDate_vzr_ins_0"), "20021980");
        clickFor(buttonMale);
        fill(By.id("person_lastName"), "Фамилия2");
        fill(By.id("person_firstName"), "Имя2");
        fill(By.id("person_middleName"), "Отчество");
        fill(By.id("person_birthDate"), "20021980");
        fill(By.id("passportSeries"), "1234");
        fill(By.id("passportNumber"), "567890");
        fill(By.id("documentDate"), "20021982");
        fill(By.id("documentIssue"), "ОДВ вселенной по рукаву Ориона");
        clickFor(finalButton);
        waitText(By.xpath("//alert-form[1]/div"), "При заполнении данных произошла ошибка");
    }

}