package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MainTest {
    private static String source;

    @BeforeAll
    static void beforeAll() {
        source = "CACABABABCCCAABAC";
    }

    @Test
    void hasRepeats() {
        //given
        int size = 4;

        //when

        boolean result = Main.hasRepeats(source, size);

        //then
        Assertions.assertTrue(result);

    }


}