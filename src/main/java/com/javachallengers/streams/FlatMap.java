package com.javachallengers.streams;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class FlatMap {

    class EliteSoldier {

        private String name;
        private List<String> weapons;

        public EliteSoldier(String name, List<String> weapons) {
            this.name = name;
            this.weapons = weapons;
        }

        public String getName() {
            return name;
        }

        public List<String> getWeapons() {
            return weapons;
        }
    }

    @Test
    void flatMapSimpleExample() {
        String[][] snakeWeapons = new String[][]{{"PSG1", "SOCOM", "Nikita"}, {"REX", "M60", "FGM-148 Javelin"}};

        Arrays.stream(snakeWeapons);

    }

    @Test
    void flatMap() {
        List<String> snakeWeapons = List.of("PSG1", "SOCOM", "Nikita");
        EliteSoldier solidSnake = new EliteSoldier("Solid Snake", snakeWeapons);

        List<String> liquidWeapons = List.of("REX", "M60", "FGM-148 Javelin");
        EliteSoldier liquidSnake = new EliteSoldier("Liquid Snake", liquidWeapons);

        List<String> revolverWeapons = List.of("Colt", "Glock 18");
        EliteSoldier revolverOcelot = new EliteSoldier("Revolver Ocelot", revolverWeapons);

        List<EliteSoldier> eliteSoldiers = List.of(solidSnake, liquidSnake, revolverOcelot);

        List<String> weapons = eliteSoldiers.stream()
                .filter(e -> e.name.contains("Snake"))
                .flatMap(e -> e.getWeapons().stream())
                .map(String::toLowerCase)
                .toList();

        System.out.println(weapons);
    }

    @Test
    void withoutFlatMap() {
        List<String> snakeWeapons = List.of("PSG1", "SOCOM", "Nikita");
        EliteSoldier solidSnake = new EliteSoldier("Solid Snake", snakeWeapons);

        List<String> liquidWeapons = List.of("REX", "M60", "FGM-148 Javelin");
        EliteSoldier liquidSnake = new EliteSoldier("Liquid Snake", liquidWeapons);

        List<String> revolverWeapons = List.of("Colt", "Glock 18");
        EliteSoldier revolverOcelot = new EliteSoldier("Revolver Ocelot", revolverWeapons);

        List<EliteSoldier> eliteSoldiers = List.of(solidSnake, liquidSnake, revolverOcelot);

        List<String> weapons = new ArrayList<>();
        for (EliteSoldier soldier : eliteSoldiers) {
            if (soldier.name.contains("Snake")) {
                for (String weapon : soldier.getWeapons()) {
                    weapons.add(weapon.toLowerCase());
                }
            }
        }

        System.out.println(weapons);
    }

    @Test
    public void flatMapPrimitiveType() {
        Stream<long[]> streamLongArray = Stream.of(new long[] {1, 2, 3, 4, 5, 6, 7});

        LongStream longStream = streamLongArray.flatMapToLong(Arrays::stream);

        longStream.forEach(System.out::print);
    }
}
