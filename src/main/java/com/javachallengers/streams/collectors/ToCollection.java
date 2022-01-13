package com.javachallengers.streams.collectors;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToCollection {

    @Test
    void toListMutable() {
        List<String> list = List.of("Atreus", "Athena", "Atreus", "Kratos");
        Set<String> newLinkedHashSet = list.stream().filter(e -> e.startsWith("At"))
                .collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println(newLinkedHashSet);
    }
}
