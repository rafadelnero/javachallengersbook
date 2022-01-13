package com.javachallengers.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

public class TakeWhile {

    @Test
    void takeWhileOrderedTest() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);

        numbers.stream()
                .takeWhile(e -> e < 5)
                .forEach(e -> System.out.print(e + " "));
    }

    @Test
    void takeWhileNotOrderedTest() {
        List<Integer> numbers = List.of(1, 2, 7, 6, 4, 5, 3);

        numbers.stream()
                .takeWhile(e -> e < 5)
                .forEach(e -> System.out.print(e + " "));
    }
}
