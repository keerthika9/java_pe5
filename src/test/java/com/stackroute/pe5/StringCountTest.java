package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringCountTest {
    StringCount stringCount;

    @Before
    public void setUp() throws Exception {
        this.stringCount=new StringCount();
    }

    @After
    public void tearDown() throws Exception {
        stringCount = null;
    }

    @Test
    public void givenStringAsInputShouldReturnCount(){
        //arrange
        Map<String, Integer> expectedValue = new HashMap<String, Integer>();
        Map<String, Integer> actualValue = new HashMap<String, Integer>();

        //Act
        expectedValue.put("one", 5);
        expectedValue.put("two", 2);
        expectedValue.put("three", 2);
        actualValue = stringCount.countStr("one one one two three one three one two");
        //Assert
        assertEquals(expectedValue, actualValue);
    }
}
