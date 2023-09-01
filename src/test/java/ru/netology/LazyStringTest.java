package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LazyStringTest {
    static LazyString string = null;
    static LazyString expectedString = null;

    @BeforeAll
    static void beforeAll() {
        String source = "CACABABABCCCAABAC";
        string = new LazyString(source, 0, 4);
        expectedString = new LazyString(source, 1, 5);

    }

    @Test
    void shiftRight() {
        //given
        LazyString newString = null;
        //when
        newString = string.shiftRight();
        //then
        Assertions.assertEquals(expectedString,newString);


    }

}