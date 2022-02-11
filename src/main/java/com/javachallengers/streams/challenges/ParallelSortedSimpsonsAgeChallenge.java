package com.javachallengers.streams.challenges;

import java.util.List;

public class ParallelSortedSimpsonsAgeChallenge {
    public static void main(String... doYourBest) {
        List<Integer> simpsonAges = List.of(38, 36, 10, 8, 1);

        simpsonAges.stream().parallel()
                .filter(s -> s > 1)
                .map(s -> s + " ")
                .forEachOrdered(System.out::print);

        System.out.println();

        simpsonAges.stream().parallel()
                .filter(s -> s > 1)
                .map(s -> s + " ")
                .forEach(System.out::print);
    }
}