package com.javachallengers.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAny {

    public static void main(String[] args) {
        findAnyExample();
    }

    public static void findAnyExample() {
        List<String> metalGearCharacters = Arrays.asList("Snake", "Ocelot", "Cipher");
        Optional<String> anyMetalGearCharacter = metalGearCharacters.stream().findAny();
        System.out.println(anyMetalGearCharacter.orElse(""));
    }
}
