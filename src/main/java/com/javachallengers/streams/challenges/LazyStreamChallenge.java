package com.javachallengers.streams.challenges;

import java.util.Arrays;
import java.util.List;

public class LazyStreamChallenge {

    public static void main(String... crewOrder) {
        List<String> crew = Arrays.asList("Kirk", "Spock", "Uhura");

        crew.stream()
                .peek(System.out::println)
                .limit(2)
                .forEach(System.out::println);
    }

}
