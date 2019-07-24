package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.TreeSet;

public class SortNames {
    ArrayList<String> sort(ArrayList<String> list) {
        TreeSet<String> set = new TreeSet<String>(list);
        return new ArrayList<String>(set);
    }
}
