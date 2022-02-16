package com.javachallengers.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

public class LazyStreams {

    @Test
    void noTerminalOperationNoAction() {
        List<String> breakingBadCharacters = List.of("Heisenberg", "Jesse", "Gus", "Saul");

        breakingBadCharacters.stream()
                .filter(e -> e.equals("Heisenberg"))
                .peek(System.out::println);
    }
}
