package com.javachallengers.streams;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CreatingStream {

    public static void main(String[] args) {
        CreatingStream creatingStream = new CreatingStream();
//        creatingStream.fromList();
//        creatingStream.fromArray();
//        creatingStream.fromBuilder();
//        creatingStream.fromGenerate();
//        creatingStream.fromIterate();
//        creatingStream.fromRange();
//        creatingStream.doubleStream();
        creatingStream.stringStream();
    }

    void fromList() {
        List<String> mavericks = List.of("X ", "Zero ", "Axl ", "Protoman ");
        Stream<String> maverickStream = mavericks.stream();
        maverickStream.forEach(System.out::print);
    }

    void fromArray() {
        String[] mavericks = new String[]{"X ", "Zero ", "Axl ", "Protoman "};
        Stream<String> maverickStream = Stream.of(mavericks);
        maverickStream.forEach(System.out::print);
    }

    void fromEmpty() {
        Stream<String> stream = Stream.empty();
    }

    void fromBuilder() {
        Stream<String> maverickStream =
                Stream.<String>builder().add("X ").add("Zero ").add("Axl ").build();
        maverickStream.forEach(System.out::print);
    }

    void fromGenerate() {
        Stream<String> maverickStream =
                Stream.generate(() -> "X ").limit(5);
        maverickStream.forEach(System.out::print);
    }

    void fromIterate() {
        Stream<Integer> iterateStream = Stream.iterate(0, n -> n + 1).limit(10);
        iterateStream.forEach(System.out::print);
    }

    void fromRange() {
        IntStream intStream = IntStream.range(1, 5);
        intStream.forEach(System.out::print);
    }

    void fromRangeClosed() {
        IntStream intStream = IntStream.rangeClosed(1, 5);
        intStream.forEach(System.out::print);
    }

    void doubleStream() {
        DoubleStream.iterate(0.0, i -> i + 1.5).limit(3)
                .forEach(n -> System.out.print(n + " "));
    }

    void stringStream() {
       Pattern.compile(",").splitAsStream("X, Zero, Axl, Sigma")
               .forEach(System.out::print);
    }
}
