package tests;

import helpers.BaseTest;
import helpers.Variables;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class FinalTasksTest extends Variables {
    private static final String baseUrl = "https://yandex.ru";
    private String FirstRez;

    @Test
    public void TaskOne() {
        BaseTest.driver.get(baseUrl);
        waitClick(market);
        ArrayList<String> Tabs = new ArrayList<>(BaseTest.driver.getWindowHandles());
        BaseTest.driver.switchTo().window(Tabs.get(1));
        waitClick(electronics);
        waitClick(tv);
        waitClick(allFilters);
        waitText(By.xpath("//div[4]/div/h1"), "Все фильтры");
        fill(minPrice, "20000");
        tvFilter1.click();
        tvFilter2.click();
        waitClick(lookRez);
        waitText(Header, "Телевизоры");
        waitClickNoClick(BaseTest.driver.findElement(By.xpath("//div[3]/div[1]/div[2]/div/div[1]/div[1]/div[4]/div[1]/h3/a")));
        ArrayList<WebElement> listRez = (ArrayList<WebElement>) BaseTest.driver.findElements(By.xpath("//div[3]/div[1]/div[2]/div/div[1]/*/div[4]/div[1]/h3/a"));
        Assert.assertEquals(48, listRez.size());
        FirstRez = listRez.get(0).getText();
        fill(search, FirstRez);
        BaseTest.driver.findElement(By.xpath("//div[2]/div/div[1]/form/span/span[2]/button")).click();
        Assert.assertEquals(FirstRez, BaseTest.driver.findElement(By.xpath("//div[3]/div[1]/div[2]/div/div[1]/div[1]/div[4]/div[1]/h3/a")).getText());
    }


    @Test
    public void TaskTwo() {
        BaseTest.driver.get(baseUrl);
        waitClick(market);
        ArrayList<String> Tabs = new ArrayList<>(BaseTest.driver.getWindowHandles());
        BaseTest.driver.switchTo().window(Tabs.get(1));
        waitClick(electronics);
        waitClick(headset);
        waitClick(allFilters);
        waitText(By.xpath("//div[4]/div/h1"), "Все фильтры");
        fill(minPrice, "5000");
        headsetFilter.click();
        waitClick(lookRez);
        waitText(Header, "Наушники и Bluetooth-гарнитуры");
        waitClickNoClick(BaseTest.driver.findElement(By.xpath("//div[1]/div[2]/div/div[1]/div[1]/div[4]/div[1]/h3/a")));
        ArrayList<WebElement> listRez = (ArrayList<WebElement>) BaseTest.driver.findElements(By.className("n-snippet-card2__title"));
        Assert.assertEquals(23, listRez.size());
        FirstRez = listRez.get(0).getText();
        fill(search, FirstRez);
        waitClick(searchBut);
        Assert.assertEquals(FirstRez, BaseTest.driver.findElement(By.xpath("/html/body/div[2]/div[5]/div[3]/div[1]/div[2]/div/div[1]/*/div[4]/div[1]/h3/a")).getText());
    }

    @After
    public void af() {
        ArrayList<String> Tabs = new ArrayList<>(BaseTest.driver.getWindowHandles());
        if (Tabs.size() > 1) {
            BaseTest.driver.close();
            BaseTest.driver.switchTo().window(Tabs.get(0));
        }
    }

}

