package ru.zavrichko.tests.properties;

import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {
//         System.getProperty("key");
//        System.setProperty("key", "value");


    @Test
    void someTest1() {
        String someValue = System.getProperty("someKey");
        System.out.println(someValue); //null


    }

    @Test
    void someTest2() {
        System.setProperty("someKey", "red value");
        String someValue = System.getProperty("someKey");
        System.out.println(someValue); // red value
    }

    @Test
    void someTest3() {
        String someValue = System.getProperty("someKey", "blue value");
        System.out.println(someValue); // blue value
    }
}
