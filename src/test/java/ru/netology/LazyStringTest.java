package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LazyStringTest {
    static LazyString string = null;
    @BeforeAll
    static void beforeAll(){
        String source = "CACABABABCCCAABAC";
        string = new LazyString(source,0,4);

    }
@Test
    void shiftRight(){
        //given
    LazyString newString=null;
    //when
    newString = string.shiftRight();
    //then
    Assertions.assertNotNull(newString);





}

}