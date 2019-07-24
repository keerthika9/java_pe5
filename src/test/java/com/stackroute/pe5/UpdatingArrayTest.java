package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UpdatingArrayTest {
    UpdatingArray updatingArray;

    @Before
    public void setUp() throws Exception {
         this.updatingArray = new UpdatingArray();
    }

    @After
    public void tearDown() throws Exception {
        updatingArray = null;
    }

    @Test
    public void addArray() {
        String expected = "[Kiwi, Grape, Mango, Berry]";
        String actual = updatingArray.add("Kiwi Grape Mango Berry".split(" ")).toString();
        assertEquals(expected, actual);
    }

    @Test
    public void removeAll() {
        String expected = "[]";
        updatingArray.add("Kiwi Grape Mango Berry".split(" "));
        String actual = updatingArray.remove().toString();
        assertEquals(expected, actual);
    }

    @Test
    public void update() {
        String expected = "[Kiwi, Grape, Mango, Berry]";
        updatingArray.add("Apple Grape Melon Berry".split(" "));
        updatingArray.update(0, "Kiwi");
        String actual = updatingArray.update(2, "Mango").toString();
        assertEquals(expected, actual);
    }
}


