package ru.geekbrains.example.junit.annotations.repeated;

import org.junit.jupiter.api.Test;

public class RepeatedTest {

    @org.junit.jupiter.api.RepeatedTest(value = 3)
    @Test

    void name() {
    }
}
