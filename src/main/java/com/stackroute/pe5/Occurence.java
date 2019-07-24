package com.stackroute.pe5;

import java.util.*;

public class Occurence {
    Map<String, Boolean>check(String[] array) {
        List asList = Arrays.asList(array);
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        Set<String> mySet = new HashSet<String>(asList);
        for (String string : mySet) {
            if (Collections.frequency(asList, string) > 1) {
                map.put(string, true);
            } else {
                map.put(string, false);
            }

        }

        return map;
    }
}