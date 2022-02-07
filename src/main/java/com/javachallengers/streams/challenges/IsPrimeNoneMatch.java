package com.javachallengers.streams.challenges;

import java.util.stream.IntStream;

public class IsPrimeNoneMatch {

    public static void main(String... doYourBest) {
        System.out.println(isPrime(6));
        System.out.println(isPrime('1'));
    }

    static boolean isPrime(final int number) {
        return number > 1 && IntStream.range(2, number)
                .noneMatch(index -> {
                    boolean lol = number % index == 0;

                    return false;
                });
    }

}
