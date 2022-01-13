package com.javachallengers.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

public class DropWhile {

    @Test
    void dropWhileOrderedTest() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);

        numbers.stream()
                .dropWhile(e -> e < 5)
                .forEach(e -> System.out.print(e + " "));
    }

    @Test
    void dropWhileNotOrderedTest() {
        List<Integer> numbers = List.of(1, 2, 7, 6, 4, 5, 3);

        numbers.stream()
                .dropWhile(e -> e < 5)
                .forEach(e -> System.out.print(e + " "));
    }
}
