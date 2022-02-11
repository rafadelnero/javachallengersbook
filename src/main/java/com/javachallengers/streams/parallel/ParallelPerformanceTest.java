package com.javachallengers.streams.parallel;

import org.junit.jupiter.api.Test;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ParallelPerformanceTest {

    @Test
    void testPerformance() {
        long timeMillis = System.currentTimeMillis();
        OptionalInt max = IntStream.rangeClosed(0, 100_000_000)
                .map(e -> e + 1)
                .parallel()
                .max();

        long processingTime = System.currentTimeMillis() - timeMillis;
        System.out.printf("Processing time in milliseconds: %s and max: %s", processingTime, max.orElse(0));
    }

    @Test
    void testPerformanceWithoutParallel() {
        long timeMillis = System.currentTimeMillis();
        OptionalInt max = IntStream.rangeClosed(0, 100_000_000)
                .map(e -> e + 1)
                .max();

        long processingTime = System.currentTimeMillis() - timeMillis;
        System.out.printf("Processing time in milliseconds: %s and max: %s", processingTime, max.orElse(0));
    }

    @Test
    void testPerformance100() {
        long timeMillis = System.currentTimeMillis();
        OptionalInt max = IntStream.rangeClosed(0, 100)
                .map(e -> e + 1)
                .parallel()
                .max();

        long processingTime = System.currentTimeMillis() - timeMillis;
        System.out.printf("Processing time in milliseconds: %s and max: %s", processingTime, max.orElse(0));
    }

    @Test
    void testPerformanceWithoutParallel100() {
        long timeMillis = System.currentTimeMillis();
        OptionalInt max = IntStream.rangeClosed(0, 100)
                .map(e -> e + 1)
//                .parallel()
                .max();

        long processingTime = System.currentTimeMillis() - timeMillis;
        System.out.printf("Processing time in milliseconds: %s and max: %s", processingTime, max.orElse(0));
    }
}
