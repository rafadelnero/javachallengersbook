package com.javachallengers.streams;

import java.util.stream.IntStream;

public class ParallelStream {

    public static void main(String[] args) {
        IntStream numbersStream = IntStream.rangeClosed(0, 15);
        numbersStream.parallel().forEach(e -> System.out.print(e + " "));
    }
}
