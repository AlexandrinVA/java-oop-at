package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.java.oop.at.base.BaseWebTest;

import java.util.stream.Stream;

import static java.lang.Thread.sleep;

@DisplayName("Навигация")
public class NavigationWebTest extends BaseWebTest {

//    Тест 1
//    Перейти на сайт https://geekbrains.ru/courses
//    Нажать на кнопку Курсы
//    Проверить что страница Курсы открылась
//    Повторить для
//    Курсы
//    Вебинары
//    Форум
//    Блог
//    Тесты
//    Карьера
//
    @AfterEach
    void tearDown(){
        WebElement header = driver.findElement(By.cssSelector("[id=\"top-menu\"]"));
        WebElement footer = driver.findElement(By.cssSelector("[class=\"site-footer\"]"));

        wait15seconds.until(ExpectedConditions.visibilityOf(header));
        wait15seconds.until(ExpectedConditions.visibilityOf(footer));
    }


    @DisplayName("Блог")
    @Test
    public void posts(){

        driver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/posts\"]")).click();

        driver.findElement(By.cssSelector("[class=\"gb-empopup-close\"]")).click();
        driver.findElement(By.cssSelector("button [class=\"svg-icon icon-popup-close-button \"]")).click();

        Assertions.assertEquals("Блог",
                driver.findElement(By.cssSelector("[id=\"top-menu\"] [class=\"gb-header__title\"]")).getText()
        );
//        chromeDriver.findElement(By.cssSelector("[class=\"gb-header__content gb-top-menu__content_application\"]"));
//        chromeDriver.findElement(By.cssSelector("[class=\"site-footer__content\"]"));
    }



    @DisplayName("Нажатие на элемент навигации")
    @ParameterizedTest
    @MethodSource("dataProvider")
    public void courses(String namePage, String valueHref){
        driver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/" + valueHref + "\"]")).click();
        Assertions.assertEquals(namePage, driver.findElement(By.cssSelector("[id=\"top-menu\"] [class=\"gb-header__title\"]"))
                .getText());
    }

    public static Stream<Arguments> dataProvider(){
        return Stream.of(
                Arguments.of("Курсы","courses"),
                Arguments.of("Вебинары", "events"),
                Arguments.of("Форум", "topics"),
//                Arguments.of("Блог", "posts"),
                Arguments.of("Тесты", "tests"),
                Arguments.of("Карьера", "career")
        );
    }

//    @DisplayName("Форум")
//    @Test
//    public void topics()  {
//
//        driver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/topics\"]")).click();
//        Assertions.assertEquals("Форум",
//                driver.findElement(By.cssSelector("[id=\"top-menu\"] [class=\"gb-header__title\"]")).getText()
//        );
////        chromeDriver.findElement(By.cssSelector("[class=\"gb-header__content gb-top-menu__content_flexbox\"]"));
////        chromeDriver.findElement(By.cssSelector("[class=\"site-footer__content\"]"));
//    }
//    @DisplayName("Вебинары")
//    @Test
//    public void events(){
//
//        driver.findElement(By.cssSelector(" [id=\"nav\"] [href=\"/events\"]")).click();
//        Assertions.assertEquals("Вебинары",
//                driver.findElement(By.cssSelector("[id=\"top-menu\"] [class=\"gb-header__title\"]")).getText()
//        );
////        chromeDriver.findElement(By.cssSelector("[class=\"gb-header__content gb-top-menu__content_flexbox\"]"));
////        chromeDriver.findElement(By.cssSelector("[class=\"site-footer__content\"]"));
//    }
//
//    @DisplayName("Тесты")
//    @Test
//    public void tests(){
//
//        driver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/tests\"]")).click();
//
//        Assertions.assertEquals("Тесты",
//                driver.findElement(By.cssSelector("[id=\"top-menu\"] [class=\"gb-header__title\"]")).getText()
//        );
//
////        chromeDriver.findElement(By.cssSelector("[class=\"gb-header__content gb-top-menu__content_flexbox\"]"));
////        chromeDriver.findElement(By.cssSelector("[class=\"site-footer__content\"]"));
//    }
//    @DisplayName("Карьера")
//    @Test
//    public void career(){
//
//        driver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/career\"]")).click();
//        Assertions.assertEquals("Карьера",
//                driver.findElement(By.cssSelector("[id=\"top-menu\"] [class=\"gb-header__title\"]")).getText()
//        );
////        chromeDriver.findElement(By.cssSelector("[class=\"gb-header__content gb-top-menu__content_flexbox\"]"));
////        chromeDriver.findElement(By.cssSelector("[class=\"site-footer__content\"]"));
//    }
//    @DisplayName("Курсы")
//    @Test
//    public void courses(){
//
//        driver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/courses\"]")).click();
//        Assertions.assertEquals("Курсы",
//                driver.findElement(By.cssSelector("[id=\"top-menu\"] [class=\"gb-header__title\"]")).getText()
//        );
////        chromeDriver.findElement(By.cssSelector("[class=\"gb-header__content gb-top-menu__content_application\"]"));
////        chromeDriver.findElement(By.cssSelector("[class=\"site-footer__content\"]"));
//    }

    }



//    @Test
//    public void checkNavigation() {
//
//        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/topics\"]")).click();
//        Assertions.assertEquals("Форум",
//                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] [class=\"gb-header__title\"]")).getText()
//        );
//
//        chromeDriver.findElement(By.cssSelector(" [id=\"nav\"] [href=\"/events\"]")).click();
//        Assertions.assertEquals("Вебинары",
//                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] [class=\"gb-header__title\"]")).getText()
//        );
//
//        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/posts\"]")).click();
//        Assertions.assertEquals("Блог",
//                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] [class=\"gb-header__title\"]")).getText()
//        );
//
//
//        chromeDriver.findElement(By.cssSelector("[class=\"gb-empopup-close\"]")).click();
//        chromeDriver.findElement(By.cssSelector("button [class=\"svg-icon icon-popup-close-button \"]")).click();
//
//        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/tests\"]")).click();
//
//
//        Assertions.assertEquals("Тесты",
//                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] [class=\"gb-header__title\"]")).getText()
//        );
//        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/career\"]")).click();
//        Assertions.assertEquals("Карьера",
//                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] [class=\"gb-header__title\"]")).getText()
//        );
//
//        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/courses\"]")).click();
//        Assertions.assertEquals("Курсы",
//                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] [class=\"gb-header__title\"]")).getText()
//        );
//
//    }