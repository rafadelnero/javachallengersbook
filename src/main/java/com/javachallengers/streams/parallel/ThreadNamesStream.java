package com.javachallengers.streams.parallel;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ThreadNamesStream {

    @Test
    void nonParallelStream() {
        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        letters.forEach(letter ->
                System.out.printf("%s Thread: %s \n", letter, Thread.currentThread().getName())
        );
    }

    @Test
    void parallelStreamThreadNames() {
        List<String> letters = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h");
        letters.parallelStream().forEach(letter -> System.out.printf("%s Thread: %s \n", letter,
                Thread.currentThread().getName()));
    }
}
