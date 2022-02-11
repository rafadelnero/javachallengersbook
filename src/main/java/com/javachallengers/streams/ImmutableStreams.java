package com.javachallengers.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ImmutableStreams {

    @Test
    void immutableStream() {
        List<String> originalList = List.of("Homer", "Marge", "Bart", "Maggie");

        List<String> newList = originalList.stream()
                .filter(e -> e.equals("Moe"))
                .toList();

        System.out.println(originalList);
        System.out.println(newList);
    }
}
