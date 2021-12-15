package com.javachallengers.streams;

import java.util.stream.Stream;

public class Limit {

    public static void main(String[] args) {
        limitBojackCharacters();
    }

    static void limitBojackCharacters() {
        Stream.of("Bojack", "Peanutbutter", "Todd", "Diane")
                .limit(2)
                .forEach(System.out::println);
    }
}
