package ru.geekbrains.example.hamcrest.greater.than;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class AnyHamcrestTest {

    @Test
    void name() {
        double numberActual = 100.00;
        double numberExpected = 99.00;

        assertThat(numberActual, allOf(
                greaterThan(numberExpected),
                lessThanOrEqualTo(101.00),
                closeTo(numberExpected, 1)
        ));
    }

    @Test
    void givenStringWhenConditionsThenCorrect() {
        String string = "Вебинары";
        assertThat(string,
                anyOf(containsString("ин"),
                endsWith("ры")));
    }

    @Test
    void givenNumberWhenConditionsThenCorrect() {
        Integer intVal = 7;
        assertThat(intVal,
                allOf(
                        greaterThan(5),
                        lessThanOrEqualTo(7),
                        not(equalTo(6))));
    }
}
