package com.javachallengers.streams;

import java.util.stream.Stream;

public class AllMatch {

    public static void main(String[] args) {
        allMatchTrue();
        allMatchFalse();
    }

    private static void allMatchTrue() {
        Stream<String> knights = Stream.of("Saori", "Shaka", "Shiryu", "Seya");
        boolean allMatch = knights.allMatch(s -> s.startsWith("S"));
        System.out.println(allMatch);
    }

    static void allMatchFalse() {
        Stream<String> knights = Stream.of("Ikki", "Shaka", "Shiryu", "Seya");
        boolean allMatch = knights.allMatch(s -> s.startsWith("S"));
        System.out.println(allMatch);
    }
}
