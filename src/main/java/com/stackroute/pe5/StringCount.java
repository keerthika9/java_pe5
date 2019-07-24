package com.stackroute.pe5;

import java.util.*;

public class StringCount {
    Map<String, Integer> countStr(String str) {
        String array[] = str.split(" ");
        List asList = Arrays.asList(array);
        Map<String, Integer> map = new HashMap<String, Integer>();
        Set<String> mySet = new HashSet<String>(asList);
        for (String string : mySet) {

            map.put(string, Collections.frequency(asList, string));
        }
        return map;
    }
}
