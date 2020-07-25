package ru.geekbrains.example.hamcrest.greater.than.objects;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ObjectsTest {

    @Test
    void sameInstanceTest() {
        String name = "Лорд";
        Dog dog1 = new Dog(name);
        Dog dog2 = dog1;

        assertThat(dog1, sameInstance(dog2));
    }


    @Test
    void hasToStringTest() {
        String name = "Лорд";
        Dog dog1 = new Dog(name);
        assertThat(dog1, hasToString("мое имя Лорд"));
    }

    @Test
    void instanceOfTest() {
        String name = "Лорд";
        Dog dog1 = new Dog(name);
        assertThat(dog1, instanceOf(Animal.class));
    }

    @Test
    void typeCompatibleWithTest() {
        assertThat(Dog.class, typeCompatibleWith(Object.class));
    }

    @Test
    void hasPropertyTest() {
        Dog dog = new Dog("Лорд");
        assertThat(dog, hasProperty("name", equalTo("Лорд")));
    }

    @Test
    void samePropertyValuesAsTest() {
        Dog dog1 = new Dog("Лорд");
        Dog dog2 = new Dog("Лорд");
        assertThat(dog1, samePropertyValuesAs(dog2));
    }



}
