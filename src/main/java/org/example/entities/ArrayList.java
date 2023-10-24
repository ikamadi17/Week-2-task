package org.example.entities;

import java.util.Arrays;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> stringList = new java.util.ArrayList<>();
        System.out.println(stringList.isEmpty());
        stringList.add("Mathematic");
        stringList.add("English");
        stringList.add("Physics");
        stringList.add("Chemistry");
        stringList.add("Chemistry");
        stringList.add("Biology");
        stringList.add("Economics");
        System.out.println(stringList);
        stringList.addAll(Arrays.asList("Mathematics " ,"English " , "Physics " , "Chemistry " , "Biology " , "Economics"));
    }
}
