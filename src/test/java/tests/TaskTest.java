package tests;

import helpers.BaseSteps;
import org.junit.Test;
import org.openqa.selenium.By;
import ru.yandex.qatools.allure.annotations.Title;
import sberbank.SberbankSteps;

public class TaskTest extends BaseSteps {
	private static final String baseUrl = "https://www.sberbank.ru/ru/person";

	@Test
	@Title("Страхование от Сбербанка")
	public void TaskOne() {
		SberbankSteps sberbankSteps = new SberbankSteps();
	//	sberbankSteps.getMainPage("https://www.sberbank.ru/ru/person");

		sberbankSteps.clickOnInsurance();
	/*	sberbankSteps.waitAndClickOn(sberbankPage.getListButtonInsurance(), sberbankPage.getListButtonInsurance().getText());
		sberbankSteps.waitAndClickOn(sberbankPage.getButtonApplyOnline(), sberbankPage.getButtonApplyOnline().getText());
		sberbankSteps.waitAndClickOn(sberbankPage.getButtonMinSum(), sberbankPage.getButtonMinSum().getText());
		sberbankSteps.waitAndClickOn(sberbankPage.getButtonRegister(), sberbankPage.getButtonRegister().getText());

		sberbankSteps.waitTextLoad(By.xpath("//form/div/fieldset[2]/legend"), "Страхователь");

		sberbankSteps.fillTextField(By.id("surname_vzr_ins_0"), "Фамилия");
		sberbankSteps.fillTextField(By.id("name_vzr_ins_0"), "Имя");
		sberbankSteps.fillTextField(By.id("birthDate_vzr_ins_0"), "20021980");

		sberbankSteps.clickOn(sberbankPage.getButtonMale(), sberbankPage.getButtonMale().getText());

		sberbankSteps.fillTextField(By.id("person_lastName"), "Фамилия2");
		sberbankSteps.fillTextField(By.id("person_firstName"), "Имя2");
		sberbankSteps.fillTextField(By.id("person_middleName"), "Отчество");
		sberbankSteps.fillTextField(By.id("person_birthDate"), "20021980");
		sberbankSteps.fillTextField(By.id("passportSeries"), "1234");
		sberbankSteps.fillTextField(By.id("passportNumber"), "567890");
		sberbankSteps.fillTextField(By.id("documentDate"), "20021982");
		sberbankSteps.fillTextField(By.id("documentIssue"), "ОДВ вселенной по рукаву Ориона");

		sberbankSteps.clickOn(sberbankPage.getFinalButton(), sberbankPage.getFinalButton().getText());

		sberbankSteps.waitTextLoad(By.xpath("//alert-form[1]/div"), "При заполнении данных произошла ошибка");*/
	}

}