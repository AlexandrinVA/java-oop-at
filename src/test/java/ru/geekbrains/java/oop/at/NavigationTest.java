package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import ru.geekbrains.java.oop.at.base.BaseTest;

import java.util.Arrays;

import static java.lang.Thread.sleep;

public class NavigationTest extends BaseTest {

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

    @Test
    public void topics()  {

        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/topics\"]")).click();
        Assertions.assertEquals("Форум",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] [class=\"gb-header__title\"]")).getText()
        );
        chromeDriver.findElement(By.cssSelector("[class=\"gb-header__content gb-top-menu__content_flexbox\"]"));
        chromeDriver.findElement(By.cssSelector("[class=\"site-footer__content\"]"));
    }

    @Test
    public void events(){

        chromeDriver.findElement(By.cssSelector(" [id=\"nav\"] [href=\"/events\"]")).click();
        Assertions.assertEquals("Вебинары",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] [class=\"gb-header__title\"]")).getText()
        );
        chromeDriver.findElement(By.cssSelector("[class=\"gb-header__content gb-top-menu__content_flexbox\"]"));
        chromeDriver.findElement(By.cssSelector("[class=\"site-footer__content\"]"));
    }

    @Test
    public void posts(){

        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/posts\"]")).click();

        chromeDriver.findElement(By.cssSelector("[class=\"gb-empopup-close\"]")).click();
        chromeDriver.findElement(By.cssSelector("button [class=\"svg-icon icon-popup-close-button \"]")).click();

        Assertions.assertEquals("Блог",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] [class=\"gb-header__title\"]")).getText()
        );
        chromeDriver.findElement(By.cssSelector("[class=\"gb-header__content gb-top-menu__content_application\"]"));
        chromeDriver.findElement(By.cssSelector("[class=\"site-footer__content\"]"));
    }

    @Test
    public void tests(){


//        chromeDriver.findElement(By.cssSelector("[class=\"gb-empopup-close\"]")).click();
//        chromeDriver.findElement(By.cssSelector("button [class=\"svg-icon icon-popup-close-button \"]")).click();

        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/tests\"]")).click();

        Assertions.assertEquals("Тесты",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] [class=\"gb-header__title\"]")).getText()
        );

        chromeDriver.findElement(By.cssSelector("[class=\"gb-header__content gb-top-menu__content_flexbox\"]"));
        chromeDriver.findElement(By.cssSelector("[class=\"site-footer__content\"]"));
    }

    @Test
    public void career(){

        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/career\"]")).click();
        Assertions.assertEquals("Карьера",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] [class=\"gb-header__title\"]")).getText()
        );
        chromeDriver.findElement(By.cssSelector("[class=\"gb-header__content gb-top-menu__content_flexbox\"]"));
        chromeDriver.findElement(By.cssSelector("[class=\"site-footer__content\"]"));
    }

    @Test
    public void courses(){

        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/courses\"]")).click();
        Assertions.assertEquals("Курсы",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] [class=\"gb-header__title\"]")).getText()
        );
        chromeDriver.findElement(By.cssSelector("[class=\"gb-header__content gb-top-menu__content_application\"]"));
        chromeDriver.findElement(By.cssSelector("[class=\"site-footer__content\"]"));
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

    }
