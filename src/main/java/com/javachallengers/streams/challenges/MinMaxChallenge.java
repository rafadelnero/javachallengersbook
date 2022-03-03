package com.javachallengers.streams.challenges;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MinMaxChallenge {

    public static void main(String... doYourBest) {
        IntStream intStream1 = Stream.of(1, 2, 3, 4, 5, 6).mapToInt(n -> n);
        IntStream intStream2 = intStream1;

        OptionalInt optIntMin = intStream1.min();
        OptionalInt optIntMax = intStream2.max();

        int sum = optIntMax.orElse(5) + optIntMin.orElse(5);
        System.out.println(sum);
    }

}