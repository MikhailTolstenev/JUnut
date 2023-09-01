package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MainParameterizedTest {
    private static String source = "CACABABABCCCAABAC";

    @ParameterizedTest
    @CsvSource({"4,true", "5,true",})
    void hasRepeats(int size, boolean expected) {
        boolean result = Main.hasRepeats(source, size);
        Assertions.assertEquals(expected, result);
    }
}