package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SortNamesTest {
    SortNames sortNames;

    @Before
    public void setUp() throws Exception {
        sortNames = new SortNames();
    }

    @After
    public void tearDown() throws Exception {
        sortNames = null;
    }

    @Test
    public void givenArrayAsInputShouldReturnSortedArray() throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> expectedValue = new ArrayList<String>();
        ArrayList<String> actualValue = new ArrayList<String>();
        list.add("Harry");
        list.add("Olive");
        list.add("Alice");
        list.add("Bluto");
        list.add("Eugene");
        expectedValue.add("Alice");
        expectedValue.add("Bluto");
        expectedValue.add("Eugene");
        expectedValue.add("Harry");
        expectedValue.add("Olive");
        actualValue = sortNames.sort(list);
        assertArrayEquals(expectedValue.toArray(), actualValue.toArray());
    }
}