package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.java.oop.at.base.BaseWebTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@DisplayName("Поиск")
public class SearchWebTest extends BaseWebTest {
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
    @DisplayName("Поиск по значениям")
    @Test
    public void checkSearch() {

        driver.findElement(By.cssSelector("[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]")).click();
        driver.findElement(By.cssSelector("[class=\"search-panel__search-field\"]"))
                .sendKeys("java");


        WebElement professions = driver.findElement(By.cssSelector("[id=\"professions\"] h2"));
        WebElement courses = driver.findElement(By.xpath(".//header/h2[text()='Курсы']"));
        WebElement events = driver.findElement(By.xpath("//h2[text() = 'Вебинары']"));
        WebElement posts = driver.findElement(By.xpath("//h2[text() = 'Блоги']"));
        WebElement forums = driver.findElement(By.xpath("//h2[text() = 'Форум']"));
        WebElement tests = driver.findElement(By.xpath("//h2[text() = 'Тесты']"));
        WebElement projectAndCompany = driver.findElement(By.xpath("//h2[text() = 'Проекты и компании']"));
        WebElement jJunior = driver.findElement(By.xpath("//a[@class=\"event__title h3 search_text\" and contains(text(), 'Что нужно знать')]"));


        WebElement professionsCount = driver.findElement(By.xpath("//a[@class='search-page-block__more' and @data-tab='professions']/span"));
        wait15seconds.until((ExpectedConditions.textToBePresentInElement(professions, "Профессии")));

        WebElement coursesCount = driver.findElement(By.xpath("//a[@class=\"search-page-block__more\" and @data-tab=\"courses\"]/span"));
        wait15seconds.until((ExpectedConditions.textToBePresentInElement(courses, "Курсы")));

        WebElement eventsCount = driver.findElement(By.xpath("//a[@class=\"search-page-block__more\" and @data-tab=\"webinars\"]/span"));
        wait15seconds.until((ExpectedConditions.textToBePresentInElement(events, "Вебинары")));

        WebElement postsCount = driver.findElement(By.xpath("//a[@class=\"search-page-block__more\" and @data-tab=\"blogs\"]/span"));
        wait15seconds.until((ExpectedConditions.textToBePresentInElement(posts, "Блоги")));

        WebElement forumsCount = driver.findElement(By.xpath("//a[@class=\"search-page-block__more\" and @data-tab=\"forums\"]/span"));
        wait15seconds.until((ExpectedConditions.textToBePresentInElement(forums, "Форум")));

        WebElement testsCount = driver.findElement(By.xpath("//a[@class=\"search-page-block__more\" and @data-tab=\"tests\"]/span"));
        wait15seconds.until((ExpectedConditions.textToBePresentInElement(tests, "Тесты")));

        WebElement gBCompany = driver.findElement(By.xpath("//a[@href=\"/career/682\" and text() = \"Образовательный портал GeekBrains\"]"));
        wait15seconds.until((ExpectedConditions.textToBePresentInElement(projectAndCompany, "Проекты и компании")));



        assertThat(Integer.parseInt(professionsCount.getText()), greaterThanOrEqualTo(2));

        assertThat(Integer.parseInt(coursesCount.getText()), greaterThan(15));

        assertThat(Integer.parseInt(eventsCount.getText()), allOf(greaterThan(180), lessThan(300)));
//    (((Integer.parseInt(eventsCount.getText()) > 180) & (Integer.parseInt(eventsCount.getText()) < 300)), "Количество вебинаров в диапазоне от 180 до 300");
        assertThat(Integer.parseInt(postsCount.getText()), greaterThan(300));
//        Assertions.assertTrue((Integer.parseInt(postsCount.getText())) > 300, "Блогов более 300");
        assertThat(Integer.parseInt(forumsCount.getText()), not(equalTo(350)));
//        Assertions.assertTrue((Integer.parseInt(forumsCount.getText())) != 350, "Количество форумов не равно 350");
        assertThat(Integer.parseInt(testsCount.getText()), not(equalTo(0)));
//        Assertions.assertTrue((Integer.parseInt(testsCount.getText())) != 0, "Количество тестов не равно 0");
        assertThat(gBCompany.getText(), equalTo("Образовательный портал GeekBrains"));
//        Assertions.assertNotNull(gBCompany, "В Проектах и компаниях отображается GeekBrains");
        assertThat(jJunior.getText(), equalTo("Java Junior. Что нужно знать для успешного собеседования?"));
//        Assertions.assertEquals(jJunior.getText(),"Java Junior. Что нужно знать для успешного собеседования?");



    }


}
















