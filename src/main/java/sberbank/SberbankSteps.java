package sberbank;

import helpers.BaseSteps;
import ru.yandex.qatools.allure.annotations.Step;

public class SberbankSteps {

	@Step("Нажатие на – Страхование")
	public void clickOnInsurance() {
		new SberbankPage().clickOnInsurance();
	}

	/*@Step("Нажатие на – {1}}")
	public void clickOn(WebElement button, String buttonText) {
		sberbankPage.clickFor(button);
	}

	@Step("Ожидание загрузки теста – {1}}")
	public void waitTextLoad(By pattern, String text) {
		sberbankPage.waitText(pattern, text);
	}

	@Step("Заполнение поля – {1}}")
	public void fillTextField(By pattern, String text) {
		sberbankPage.fill(pattern, text);
	}*/



}
