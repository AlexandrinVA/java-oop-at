package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.geekbrains.java.oop.at.base.BaseTest;

import static java.lang.Thread.sleep;

public class SearchTest extends BaseTest {
//    Тест 2
//    Перейти на сайт https://geekbrains.ru/courses
//    Нажать на кнопку Поиск
//    В поле Поиск ввести текст: java
//    Проверить что отобразились блоки:
//    Профессии
//    Курсы
//    Вебинары
//    Блоги
//    Форум
//    Тесты
//    Проекты и компании

    @Test
    public void checkSearch()  {



        chromeDriver.findElement(By.cssSelector("[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]")).click();
        chromeDriver.findElement(By.cssSelector("[class=\"search-panel__search-field\"]"))
                .sendKeys("java");



        chromeDriver.findElement(By.cssSelector("[id=\"professions\"] h2"));
        chromeDriver.findElement(By.cssSelector("[id=\"professions\"] h2"));
        chromeDriver.findElementByXPath("//h2[text() = 'Вебинары']");
        chromeDriver.findElementByXPath("//h2[text() = 'Блоги']");
        chromeDriver.findElementByXPath("//h2[text() = 'Форум']");
        chromeDriver.findElementByXPath("//h2[text() = 'Тесты']");
        chromeDriver.findElementByXPath("//h2[text() = 'Проекты и компании']");


    }
}
















