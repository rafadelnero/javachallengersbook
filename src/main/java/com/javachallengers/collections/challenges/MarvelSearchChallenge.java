package com.javachallengers.collections.challenges;

import java.util.Arrays;

public class MarvelSearchChallenge {

    static String[] marvel = {"Spider-man","Venom", "Carnage", "Mysterio"};

    public static void main(String[] args) {
        Arrays.sort(marvel);

        for (String test:
             marvel) {
            System.out.print(test);
        }

        System.out.print(Arrays.binarySearch(marvel, "Xavier") + " ");
        System.out.print(marvel[Arrays.binarySearch(marvel, "Carnage")] + " ");
        System.out.print(Arrays.binarySearch(marvel, "Lizard") + " ");
        System.out.println(Arrays.binarySearch(marvel, "Spider-man"));
    }
}