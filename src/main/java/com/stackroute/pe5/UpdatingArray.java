package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArray {
    private List<String> stringList = new ArrayList<>();

    public List<String> add(String[] inputArray) {
        for (String input : inputArray) {
            stringList.add(input);
        }
        return stringList;
    }

    public List<String> remove() {
        stringList.clear();
        return stringList;
    }

    public List<String> update(int index, String value) {
        stringList.set(index, value);
        return stringList;
    }
}
