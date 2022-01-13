package com.javachallengers.streams.challenges;

import java.util.stream.IntStream;

public class TakeDropWhileChallenge {

    public static void main(String... doYourBest) {
        IntStream.iterate(10, i -> i - 2)
            .limit(5)
            .skip(1)
            .dropWhile(i -> i < 6)
//            .sorted()
//            .takeWhile(i -> i > 2)
            .forEach(System.out::print);
    }
}
