package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest2 {
    private static String source = "CACABABABCCCAABAC";

    @ParameterizedTest
    @CsvSource( {
            "4,true",
            "5,true",
    })
    void hasRepeats (int size, boolean expected)
    {
        boolean result = Main.hasRepeats(source,size);
        Assertions.assertEquals(expected,result);


    }

}