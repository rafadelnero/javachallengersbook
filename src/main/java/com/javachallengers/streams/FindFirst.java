package com.javachallengers.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {

    public static void main(String[] args) {
        List<String> metalGearCharacters = Arrays.asList("Snake", "Ocelot", "Cipher");
        Optional<String> firstCharacter = metalGearCharacters.stream().findFirst();
        System.out.println(firstCharacter.get());

        findFirstFiltered();
    }

    static void findFirstFiltered() {
        List<String> metalGearCharacters = Arrays.asList("Snake", "Ocelot", "Otacon");
        Optional<String> firstCharacter = metalGearCharacters.stream()
                .filter(e -> e.startsWith("O")).findFirst();
        System.out.println(firstCharacter.orElse(""));
    }
}
