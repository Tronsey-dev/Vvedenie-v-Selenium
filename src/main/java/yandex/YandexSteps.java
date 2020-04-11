package yandex;

import ru.yandex.qatools.allure.annotations.Step;

public class YandexSteps {

    private YandexPage yandexPage = new YandexPage();

    @Step("Переход на страницу Яндекса: {0}")
    public void goToUrl(String url) {
        yandexPage.goToUrl(url);
    }


}
