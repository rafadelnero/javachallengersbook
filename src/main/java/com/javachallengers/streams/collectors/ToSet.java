package com.javachallengers.streams.collectors;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToSet {

    @Test
    void toSetMutable() {
        List<String> list = List.of("Kratos", "Kratos", "Kratos", "Atreus");
        Set<String> newSet = list.stream().filter(e -> e.startsWith("Kr"))
                .collect(Collectors.toSet());

        System.out.println(newSet);
    }

    @Test
    void toSetImmutable() {
        List<String> list = List.of("Kratos", "Kratos", "Kratos", "Atreus");
        Set<String> newSet = list.stream().filter(e -> e.startsWith("Kr"))
                .collect(Collectors.toUnmodifiableSet());

        newSet.add("Athena");
    }
}
