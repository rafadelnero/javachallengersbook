package com.javachallengers.streams;

import java.util.stream.Stream;

public class NoneMatch {

    public static void main(String[] args) {
        noneMatchTrue();
        noneMatchFalse();
    }

    private static void noneMatchTrue() {
        Stream<String> knights = Stream.of("Shun", "Shaka", "Shiryu", "Seya");
        boolean noneMatch = knights.noneMatch(s -> s.startsWith("B"));
        System.out.println(noneMatch);
    }

    private static void noneMatchFalse() {
        Stream<String> knights = Stream.of("Shun", "Shaka", "Shiryu", "Seya");
        boolean noneMatch = knights.noneMatch(s -> s.startsWith("S"));
        System.out.println(noneMatch);
    }
}
