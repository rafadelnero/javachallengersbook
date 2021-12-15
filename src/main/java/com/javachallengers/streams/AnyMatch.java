package com.javachallengers.streams;

import java.util.stream.Stream;

public class AnyMatch {

    public static void main(String[] args) {
        Stream<String> knights = Stream.of("Milo", "Aiolos", "Shiryu", "Ikki");
        boolean anyMatch = knights.anyMatch(s -> s.startsWith("S"));
        System.out.println(anyMatch);
    }
}
