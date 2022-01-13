package com.javachallengers.streams.collectors;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class ToList {

    @Test
    void toListMutable() {
        List<String> list = List.of("Atreus", "Athena", "Kratos");
        List<String> newList = list.stream().filter(e -> e.startsWith("At"))
                .collect(Collectors.toList());

        System.out.println(newList);
    }

    @Test
    void toListImmutable() {
        List<String> list = List.of("Atreus", "Athena", "Kratos");
        List<String> newList = list.stream().filter(e -> e.startsWith("At"))
                .collect(Collectors.toUnmodifiableList());

        newList.add("Minotaur");
    }

    @Test
    void toListImmutableJava16() {
        List<String> list = List.of("Atreus", "Athena", "Kratos");
        List<String> newList = list.stream().filter(e -> e.startsWith("At")).toList();

        System.out.println(newList);
    }

}
