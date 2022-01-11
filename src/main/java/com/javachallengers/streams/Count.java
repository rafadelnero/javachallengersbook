package com.javachallengers.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Count {

    public static void main(String[] args) {
        var oddCount = IntStream.of(1, 2, 3, 4, 5, 6, 7)
                .filter(i -> i % 2 == 1)
                .count();

        System.out.println(oddCount);

        var saiyanCount = Stream.of("Goku", "Frieza", "Goten", "Gohan")
                .filter(e -> e.startsWith("Go"))
                .count();

        System.out.println(saiyanCount);
    }
}
