package com.javachallengers.streams.challenges;

import java.util.List;

public class MatrixPeekOrder {
    public static void main(String... crewOrder) {
        List<String> crew = List.of("Neo ", "Trinity ", "Morpheus ");

        crew.stream()
            .peek(e -> System.out.print(e + "peek "))
            .limit(1)
            .forEach(e -> System.out.print(e + "forEach "));
    }
}
