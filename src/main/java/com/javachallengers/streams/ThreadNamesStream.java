package com.javachallengers.streams;

import java.util.Arrays;
import java.util.List;

public class ThreadNamesStream {

    public static void main(String[] args) {
        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        letters.forEach(letter ->
                System.out.printf("%s Thread: %s ", letter, Thread.currentThread().getName())
        );

//        parallelStream();
    }

    static void parallelStream() {
        List<String> letters = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h");
        letters.parallelStream().forEach(letter -> System.out.printf("%s Thread: %s ", letter,
                Thread.currentThread().getName()));
    }
}
