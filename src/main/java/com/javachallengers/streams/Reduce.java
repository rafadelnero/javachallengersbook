package com.javachallengers.streams;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.LongStream;

public class Reduce {

    public static void main(String[] args) {
        List<Integer> numbersList = List.of(2, 2, 4, 7);
        int result = numbersList
                .stream()
                .reduce(0, (accumulator, eachNumber) -> accumulator + eachNumber);

        System.out.println(result);

        result = numbersList
                .stream()
                .reduce(0, Integer::sum);

        System.out.println(result);

        combineStrings();
    }

    static void combineStrings() {
        List<String> words = List.of("va", " ", "ro", "cks");
        String result = words
                .stream()
                .reduce("ja", (accumulator, eachString) -> accumulator + eachString);
        System.out.println(result);
    }

    @Test
    void withoutParallelReduce() {
        var startMillis = System.currentTimeMillis();
        LongStream longStream = LongStream.rangeClosed(1, 1_000_000_000);
        var result = longStream
                .reduce(0, Long::sum);

        System.out.println(result);
        System.out.println(System.currentTimeMillis() - startMillis + " milliseconds");
    }

    @Test
    void withParallelReduce() {
        var startMillis = System.currentTimeMillis();
        LongStream longStream = LongStream.rangeClosed(1, 1_000_000_000);
        var result = longStream.parallel()
                .reduce(0, Long::sum);

        System.out.println(result);
        System.out.println(System.currentTimeMillis() - startMillis + " milliseconds");
    }

}
