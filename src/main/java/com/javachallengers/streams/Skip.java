package com.javachallengers.streams;

import java.util.stream.Stream;

public class Skip {

    public static void main(String[] args) {
        skipElements();
    }

    public static void skipElements() {
        Stream.of("Bojack", "Todd", "Peanutbutter", "Princess Carolyn", "Diane")
                .filter(e -> e.length() > 4)
                .skip(2)
                .forEach(e -> System.out.print(e + " "));
    }
}
