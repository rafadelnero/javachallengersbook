package com.javachallengers.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Min {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(40, 10, 1, 5, 7, 99);
        Optional<Integer> max = numbers.stream()
                .max((i, j) -> i.compareTo(j));

        System.out.println(max.get());

        max = numbers.stream()
                .max(Integer::compareTo);

        System.out.println(max.get());
    }
}
