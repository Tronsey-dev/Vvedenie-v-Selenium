package tests;

import helpers.BaseSteps;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;
import yandex.YandexSteps;

import java.util.ArrayList;

public class FinalYandexTest extends BaseSteps {
    private static final String baseUrl = "https://yandex.ru/";
    private YandexSteps yandexSteps = new YandexSteps();

    @Test
    @Title("Яндекс Маркет, телевизоры")
    public void TaskOne() {
        yandexSteps.goToUrl(baseUrl);
        yandexSteps.clickOnMarket();
        yandexSteps.switchPageOnMarket();
        yandexSteps.clickOnElectron();
        yandexSteps.clickOnTv();
        yandexSteps.clickOnFilters();
        yandexSteps.fillMinPrice("20000");
        yandexSteps.clickTvFilters();
        yandexSteps.clickResAndWait("Телевизоры");
        String firstRes = yandexSteps.getTvList("//div[3]/div[1]/div[2]/div/div[1]/*/div[4]/div[1]/h3/a");
        yandexSteps.fillSearch(firstRes);
        yandexSteps.clickOnSearch(firstRes, "//div[3]/div[1]/div[2]/div/div[1]/div[1]/div[4]/div[1]/h3/a");
    }

    @Test
    @Title("Яндекс Маркет, наушники")
    public void TaskTwo() {
        yandexSteps.goToUrl(baseUrl);
        yandexSteps.clickOnMarket();
        yandexSteps.switchPageOnMarket();
        yandexSteps.clickOnElectron();
        yandexSteps.clickOnHeadset();
        yandexSteps.clickOnFilters();
        yandexSteps.fillMinPrice("5000");
        yandexSteps.clickOnHeadSetFilters();
        yandexSteps.clickResAndWait("Наушники и Bluetooth-гарнитуры");
        String firstRes = yandexSteps.getHeadsetList("n-snippet-card2__title");
        yandexSteps.fillSearch(firstRes);
        yandexSteps.clickOnSearch(firstRes, "/html/body/div[2]/div[5]/div[3]/div[1]/div[2]/div/div[1]/*/div[4]/div[1]/h3/a");
    }

    @After
    public void af() {
        ArrayList<String> Tabs = new ArrayList<>(BaseSteps.getDriver().getWindowHandles());
        if (Tabs.size() > 1) {
            BaseSteps.getDriver().close();
            BaseSteps.getDriver().switchTo().window(Tabs.get(0));
        }
    }
}

