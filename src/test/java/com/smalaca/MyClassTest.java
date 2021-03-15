package com.smalaca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyClassTest {

    @Test
    void shouldRecognizeTrue() {
        boolean actual = new MyClass(true).isWhat();

        Assertions.assertTrue(actual);
    }

    @Test
    void shouldRecognizeFalse() {
        boolean actual = new MyClass(false).isWhat();

        Assertions.assertFalse(actual);
    }
}