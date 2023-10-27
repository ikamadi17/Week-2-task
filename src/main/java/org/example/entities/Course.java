package org.example.entities;

import java.util.ArrayList;
import java.util.Arrays;

public class Course {
    public static <Arraylist> void main(String[] args) {
        ArrayList<String> Arraylist = new ArrayList<>();
        Arraylist = new ArrayList<>(Arrays.asList("MATHEMATICS", "ENGLISH", "PHYSICS", "CHEMISTRY", "BIOLOGY", "ECONOMICS"));

        System.out.println("The Courses Offered are " + Arraylist);
    }


}