package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
//    Проверить что на странице:
//    Профессий не менее чем 2
//    Курсов более 15
//    Вебинаров больше чем 180, но меньше 300
//    В вебинарах отображается первым “Java Junior. Что нужно знать для успешного собеседования?”
//    Блогов более 300
//    Форумов не 350
//    Тестов не 0
//    В Проектах и компаниях отображается GeekBrains

    @Test
    public void checkSearch() {

        chromeDriver.findElement(By.cssSelector("[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]")).click();
        chromeDriver.findElement(By.cssSelector("[class=\"search-panel__search-field\"]"))
                .sendKeys("java");


        WebElement professions = chromeDriver.findElement(By.cssSelector("[id=\"professions\"] h2"));
        WebElement courses = chromeDriver.findElement(By.xpath(".//header/h2[text()='Курсы']"));
        WebElement events = chromeDriver.findElementByXPath("//h2[text() = 'Вебинары']");
        WebElement posts = chromeDriver.findElementByXPath("//h2[text() = 'Блоги']");
        WebElement forums = chromeDriver.findElementByXPath("//h2[text() = 'Форум']");
        WebElement tests = chromeDriver.findElementByXPath("//h2[text() = 'Тесты']");
        WebElement projectAndCompany = chromeDriver.findElementByXPath("//h2[text() = 'Проекты и компании']");
        WebElement jJunior = chromeDriver.findElement(By.xpath("//a[@class=\"event__title h3 search_text\" and contains(text(), 'Что нужно знать')]"));


        WebElement professionsCount = chromeDriver.findElement(By.xpath("//a[@class='search-page-block__more' and @data-tab='professions']/span"));
        wait15seconds.until((ExpectedConditions.textToBePresentInElement(professions, "Профессии")));
        Assertions.assertTrue((Integer.parseInt(professionsCount.getText())) >= 2, "Количество найденных профессий менее 2!");
        WebElement coursesCount = chromeDriver.findElement(By.xpath("//a[@class=\"search-page-block__more\" and @data-tab=\"courses\"]/span"));
        wait15seconds.until((ExpectedConditions.textToBePresentInElement(courses, "Курсы")));

        WebElement eventsCount = chromeDriver.findElement(By.xpath("//a[@class=\"search-page-block__more\" and @data-tab=\"webinars\"]/span"));
        wait15seconds.until((ExpectedConditions.textToBePresentInElement(events, "Вебинары")));

        WebElement postsCount = chromeDriver.findElement(By.xpath("//a[@class=\"search-page-block__more\" and @data-tab=\"blogs\"]/span"));
        wait15seconds.until((ExpectedConditions.textToBePresentInElement(posts, "Блоги")));

        WebElement forumsCount = chromeDriver.findElement(By.xpath("//a[@class=\"search-page-block__more\" and @data-tab=\"forums\"]/span"));
        wait15seconds.until((ExpectedConditions.textToBePresentInElement(forums, "Форум")));

        WebElement testsCount = chromeDriver.findElement(By.xpath("//a[@class=\"search-page-block__more\" and @data-tab=\"tests\"]/span"));
        wait15seconds.until((ExpectedConditions.textToBePresentInElement(tests, "Тесты")));

        WebElement gBCompany = chromeDriver.findElement(By.xpath("//a[@href=\"/career/682\" and text() = \"Образовательный портал GeekBrains\"]"));
        wait15seconds.until((ExpectedConditions.textToBePresentInElement(projectAndCompany, "Проекты и компании")));




        Assertions.assertTrue(Integer.parseInt(coursesCount.getText()) > 15, "Количество найденных курсов больще 15");

        Assertions.assertTrue(((Integer.parseInt(eventsCount.getText()) > 180) & (Integer.parseInt(eventsCount.getText()) < 300)), "Количество вебинаров в диапазоне от 180 до 300");

        Assertions.assertTrue((Integer.parseInt(postsCount.getText())) > 300, "Блогов более 300");

        Assertions.assertTrue((Integer.parseInt(forumsCount.getText())) != 350, "Количество форумов не равно 350");

        Assertions.assertTrue((Integer.parseInt(testsCount.getText())) != 0, "Количество тестов не равно 0");

        Assertions.assertNotNull(gBCompany, "В Проектах и компаниях отображается GeekBrains");

        Assertions.assertEquals(jJunior.getText(),"Java Junior. Что нужно знать для успешного собеседования?");



    }


}
















