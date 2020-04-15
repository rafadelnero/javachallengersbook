package com.javachallengers.basictypes.arrays;

import java.util.Arrays;

public class ManipulatingArrays {

    public static void main(String[] args) {
        String [] simpsonCharacterNames = { "Moe",  "Burns", "Bart" };
        System.out.println(simpsonCharacterNames[1]);

        for (int i = 0; i < simpsonCharacterNames.length; i++) {
            System.out.println(simpsonCharacterNames[i]);
        }

        int i = 0;
        while (i < simpsonCharacterNames.length) {
            System.out.println(simpsonCharacterNames[i++]);
        }

        for (String eachCharacterName : simpsonCharacterNames) {
            System.out.println(eachCharacterName);
        }

        Arrays.stream(simpsonCharacterNames).forEach(System.out::println);
    }
}
