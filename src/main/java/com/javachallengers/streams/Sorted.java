package com.javachallengers.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

    public static void main(String[] args) {
//        sorted();
        reverseOrder();
    }

    static void sorted() {
        List<String> zodiacKnights = Arrays.asList("Shaka", "Kanon", "Aldebaran", "Seya", "Ikki");
        zodiacKnights.stream().sorted().forEach(e -> System.out.print(e + " "));
    }

    static void reverseOrder() {
        List<String> zodiacKnights = Arrays.asList("Aldebaran", "Seya", "Shaka", "Ikki", "Kanon");
        zodiacKnights.stream().sorted(Comparator.reverseOrder())
                .forEach(e -> System.out.print(e + " "));
    }
}
