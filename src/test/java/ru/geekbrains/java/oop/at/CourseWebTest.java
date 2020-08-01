package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.java.oop.at.base.BeforeAndAfterStep;
import ru.geekbrains.java.oop.at.block.ContentNavigationCourseBlock;
import ru.geekbrains.java.oop.at.block.LeftNavigation;
import ru.geekbrains.java.oop.at.page.content.CoursePage;

public class CourseWebTest extends BeforeAndAfterStep {

    @DisplayName("Проверка работы фильтров")
    @Test
    void checkSingInValidLogin() {
        CoursePage coursePage = ((CoursePage)
                new CoursePage(driver)
                        .openUrl()
                        .closedPopUp()
                        .getLeftNavigation()
                        .clickButton(LeftNavigation.Button.COURSES)
        );

        coursePage.getContentNavigationCourseBlock().clickTab(ContentNavigationCourseBlock.Tab.COURSES)
                .configFilter("Бесплатные", "Тестирование")
                .checkingDisplayedCourses(
                        "Тестирование ПО. Уровень 1",
                        "Тестирование ПО. Уровень 2"
                );
    }
}
