package com.example.homework6android3;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathTest {
    Math math;

    @Before
    public void initMath(){
        math = new Math();
    }

    @Test
    public void simpleAddTest(){
        assertEquals("12" , math.plus("7","5"));
    }

    @Test
    public void addWithSpaces(){
        assertEquals("12" , math.plus("  7   " , "     5  "));
    }

    @Test
    public void addWithMinusTestCase(){
        assertEquals("вы использовали отрицательное число" , math.minus("-3" , "2"));
    }

    @Test
    public void simpleDivideWithZeroTest(){
        assertEquals("нельзя делить на 0" , math.divide("8" , "0"));
    }

    @Test
    public void simpleMinusTest(){
        assertEquals("6" , math.minus("12" , "6"));
    }

    @Test
    public void simpleDivideTest(){
        assertEquals("8" , math.divide("16" , "2"));
    }

    @Test
    public void simpleMultiTest(){
        assertEquals("10" , math.multi("5" , "2"));
    }
    @Test
    public void SymbolTest(){
        assertEquals("у вас есть лишние символы" , math.checkSymbol("2" , "2a"));
    }

    @After
    public void detach(){
        math = null;
    }

}
