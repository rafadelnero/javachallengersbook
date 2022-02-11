package com.javachallengers.streams.parallel;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class ParallelStream {

    @Test
    public void parallelUnordered() {
        IntStream numbersStream = IntStream.rangeClosed(0, 15);
        numbersStream.parallel().forEach(e -> System.out.print(e + " "));
    }

    @Test
    public void parallelOrdered() {
        IntStream numbersStream = IntStream.rangeClosed(0, 15);
        numbersStream.parallel().forEachOrdered(e -> System.out.print(e + " "));
    }
}
