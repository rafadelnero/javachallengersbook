package com.javachallengers.streams;

import java.util.List;

public class Map {

    public static void main(String[] args) {
        mapToUpperCase();
    }

    static void mapConcat() {
        List<String> bojackCharacters = List.of("Bojack", "Diane", "Todd");
        bojackCharacters.stream()
                .map(b -> b.concat(" and Mr. Peanutbutter"))
                .forEach(System.out::println);
    }

    static void mapToUpperCase() {
        List<String> bojackCharacters = List.of("Bojack", "Diane", "Todd");
        bojackCharacters.stream()
                .map(String::toUpperCase)
                .forEach(bojackCharacter -> System.out.print(bojackCharacter + " "));
    }

    static void mapStringToIntLength() {
        List<String> bojackCharacters = List.of("Bojack", "Diane", "Todd");

        bojackCharacters.stream()
//                .map(b -> b.length())
                .map(String::length)
                .filter(l -> l >= 5)
                .forEach(System.out::println);
    }

    static void mapMultiplyNumber() {
        List<Integer> numbers = List.of(1, 2, 3, 4);

        numbers.stream()
                .map(n -> n * 2)
                .forEach(n -> System.out.print(n + " "));
    }
}
