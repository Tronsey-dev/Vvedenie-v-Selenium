package tests;

import helpers.BaseSteps;
import org.junit.After;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;
import yandex.YandexPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import yandex.YandexSteps;

import java.util.ArrayList;

public class FinalTasksTest extends BaseSteps {
    private static final String baseUrl = "https://yandex.ru";
    private String FirstRez;
    private YandexSteps yandexSteps = new YandexSteps();

    @Test
    @Title("Яндекс Маркет, телевизоры")
    public void TaskOne() {
        yandexSteps.goToUrl(baseUrl);
       /* waitClick(variables.getMarket());
        ArrayList<String> Tabs = new ArrayList<>(BaseSteps.driver.getWindowHandles());
        BaseSteps.driver.switchTo().window(Tabs.get(1));
        waitClick(variables.getElectronics());
        waitClick(variables.getTv());
        waitClick(variables.getAllFilters());
        waitText(By.xpath("//div[4]/div/h1"), "Все фильтры");
        fill(variables.getMinPrice(), "20000");
        variables.getTvFilter1().click();
        variables.getTvFilter2().click();
        waitClick(variables.getLookRez());
        waitText(variables.getHeader(), "Телевизоры");
        waitClickNoClick(BaseSteps.driver.findElement(By.xpath("//div[3]/div[1]/div[2]/div/div[1]/div[1]/div[4]/div[1]/h3/a")));
        ArrayList<WebElement> listRez = (ArrayList<WebElement>) BaseSteps.driver.findElements(By.xpath("//div[3]/div[1]/div[2]/div/div[1]//div[4]/div[1]/h3/a"));
        Assert.assertEquals(48, listRez.size());
        FirstRez = listRez.get(0).getText();
        fill(variables.getSearch(), FirstRez);
        BaseSteps.driver.findElement(By.xpath("//div[2]/div/div[1]/form/span/span[2]/button")).click();
        Assert.assertEquals(FirstRez, BaseSteps.driver.findElement(By.xpath("//div[3]/div[1]/div[2]/div/div[1]/div[1]/div[4]/div[1]/h3/a")).getText());*/
    }


   // @Test
   /* public void TaskTwo() {
        BaseSteps.driver.get(baseUrl);
        waitClick(variables.getMarket());
        ArrayList<String> Tabs = new ArrayList<>(BaseSteps.driver.getWindowHandles());
        BaseSteps.driver.switchTo().window(Tabs.get(1));
        waitClick(variables.getElectronics());
        waitClick(variables.getHeadset());
        waitClick(variables.getAllFilters());
        waitText(By.xpath("//div[4]/div/h1"), "Все фильтры");
        fill(variables.getMinPrice(), "5000");
        variables.getHeadsetFilter().click();
        waitClick(variables.getLookRez());
        waitText(variables.getHeader(), "Наушники и Bluetooth-гарнитуры");
        waitClickNoClick(BaseSteps.driver.findElement(By.xpath("//div[1]/div[2]/div/div[1]/div[1]/div[4]/div[1]/h3/a")));
        ArrayList<WebElement> listRez = (ArrayList<WebElement>) BaseSteps.driver.findElements(By.className("n-snippet-card2__title"));
        Assert.assertEquals(23, listRez.size());
        FirstRez = listRez.get(0).getText();
        fill(variables.getSearch(), FirstRez);
        waitClick(variables.getSearchBut());
        Assert.assertEquals(FirstRez, BaseSteps.driver.findElement(By.xpath("/html/body/div[2]/div[5]/div[3]/div[1]/div[2]/div/div[1]//div[4]/div[1]/h3/a")).getText());
    }*/

    @After
    public void af() {
        ArrayList<String> Tabs = new ArrayList<>(BaseSteps.getDriver().getWindowHandles());
        if (Tabs.size() > 1) {
            BaseSteps.getDriver().close();
            BaseSteps.getDriver().switchTo().window(Tabs.get(0));
        }
    }

}

