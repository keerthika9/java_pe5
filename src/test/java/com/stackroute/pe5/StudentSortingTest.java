package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.*;

import static org.junit.Assert.*;

public class StudentSortingTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testStudent() {

        List<StudentSorting> students = new ArrayList<>();
        StudentSorting obj1 = new StudentSorting(1, "KEER", 27);
        StudentSorting obj2 = new StudentSorting(2, "SRUTHI", 23);
        StudentSorting obj3 = new StudentSorting(3, "AFREEN", 37);
        StudentSorting obj4 = new StudentSorting(4, "AKHIL", 22);
        students.add(obj1);
        students.add(obj2);
        students.add(obj3);
        students.add(obj4);
        Collections.sort(students, new StudentSorting());
        String expected = "[Student{id=3, name='AFREEN', age=37}, Student{id=1, name='AKHIL', age=27}, Student{id=2, name='KEER', age=23},  Student{id=4, name='SRUTHI', age=22}]";
        assertEquals(expected, students.toString());
    }
}