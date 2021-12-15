package com.javachallengers.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Peek {

    public static void main(String[] args) {
        List<String> bojackList = List.of("Bojack", "Diane", "Todd");
        bojackList.stream().peek(System.out::println);

        peekInAction();
    }

    static void peekInAction() {
        List<String> bojackCharacters = Stream.of("BOJACK", "DIANE", "TODD")
                .map(String::toLowerCase)
                .peek(e -> System.out.println("Lower Case Elements: " + e))
                .filter(e -> e.equals("bojack"))
                .peek(e -> System.out.println("Filtered to bojack: " + e))
                .collect(Collectors.toList());

        System.out.println(bojackCharacters);
    }

}
