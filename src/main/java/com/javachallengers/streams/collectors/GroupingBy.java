package com.javachallengers.streams.collectors;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingBy {

    class Hero {

        private String name;
        private int fightPower;
        private String studio;

        public Hero(String name, int fightPower, String studio) {
            this.name = name;
            this.fightPower = fightPower;
            this.studio = studio;
        }

        public String getName() {
            return name;
        }

        public int getFightPower() {
            return fightPower;
        }

        public String getStudio() {
            return studio;
        }

        @Override
        public String toString() {
            return "Hero{" +
                    "name='" + name + '\'' +
                    ", fightPower=" + fightPower +
                    ", studio='" + studio + '\'' +
                    '}';
        }
    }

    @Test
    public void counting() {
        List<String> heroes = List.of("Batman", "Iron Man", "Batman",
                        "Spider-Man", "Spider-Man", "Spider-Man");

        Map<String, Long> productsCount = heroes.stream().collect(
                        Collectors.groupingBy(String::valueOf, Collectors.counting())
        );

        System.out.println(productsCount);
    }

    @Test
    public void sumFightPower() {
        List<Hero> heroes = List.of(new Hero("Batman", 10, "DC"),
                new Hero("Iron Man", 10, "Marvel"), new Hero("Wolverine", 12, "Marvel"),
                new Hero("Spider-Man", 9, "Marvel"), new Hero("Superman", 10, "DC"),
                new Hero("Wonder Woman", 8, "DC"));

        Map<String, Integer> sumOfFightPowerByStudio = heroes.stream().collect(
                Collectors.groupingBy(Hero::getStudio, Collectors.summingInt(Hero::getFightPower)));

        System.out.println(sumOfFightPowerByStudio);
    }

    @Test
    public void countingObject() {
        List<Hero> heroes = List.of(new Hero("Batman", 10, "DC"),
                new Hero("Iron Man", 10, "Marvel"), new Hero("Wolverine", 12, "Marvel"),
                new Hero("Spider-Man", 9, "Marvel"), new Hero("Superman", 10, "DC"),
                new Hero("Wonder Woman", 8, "DC"));

        Map<String, Long> counting = heroes.stream().collect(
                Collectors.groupingBy(Hero::getStudio, Collectors.counting()));

        System.out.println(counting);
    }

    @Test
    public void heroesByStudio() {
        List<Hero> heroes = List.of(new Hero("Batman", 10, "DC"),
                new Hero("Iron Man", 10, "Marvel"), new Hero("Wolverine", 12, "Marvel"),
                new Hero("Spider-Man", 9, "Marvel"), new Hero("Superman", 10, "DC"),
                new Hero("Wonder Woman", 8, "DC"));

        Map<String, List<Hero>> groupByHero =
                heroes.stream().collect(Collectors.groupingBy(Hero::getStudio));

        System.out.println(groupByHero);
    }

    @Test
    public void heroesNameByStudio() {
        List<Hero> heroes = List.of(new Hero("Batman", 10, "DC"),
                new Hero("Iron Man", 10, "Marvel"), new Hero("Wolverine", 12, "Marvel"),
                new Hero("Spider-Man", 9, "Marvel"), new Hero("Superman", 10, "DC"),
                new Hero("Wonder Woman", 8, "DC"));

        Map<String, List<String>> heroesNamesByStudio =
            heroes.stream().collect(Collectors.groupingBy(Hero::getStudio,
                            Collectors.mapping(Hero::getName, Collectors.toList())
                    )
            );

        System.out.println(heroesNamesByStudio);
    }

    @Test
    public void heroesDeduplicateNamesByStudio() {
        List<Hero> heroes = List.of(new Hero("Batman", 10, "DC"),
                new Hero("Iron Man", 10, "Marvel"), new Hero("Batman", 12, "Marvel"),
                new Hero("Batman", 9, "Marvel"), new Hero("Batman", 10, "DC"),
                new Hero("Wonder Woman", 8, "DC"));

        Map<String, Set<String>> deduplicatedNamesByStudio =
                heroes.stream().collect(Collectors.groupingBy(Hero::getStudio,
                                Collectors.mapping(Hero::getName, Collectors.toSet())
                        )
                );

        System.out.println(deduplicatedNamesByStudio);
    }

    @Test
    public void sortHighestHeroFightPowerByStudio() {
        List<Hero> heroes = List.of(new Hero("Batman", 10, "DC"),
                new Hero("Iron Man", 10, "Marvel"), new Hero("Wolverine", 12, "Marvel"),
                new Hero("Spider-Man", 9, "Marvel"), new Hero("Superman", 11, "DC"),
                new Hero("Wonder Woman", 9, "DC"));

        Map<String, Integer> heroesNamesByStudio = heroes.stream().collect(
                Collectors.groupingBy(Hero::getName, Collectors.summingInt(Hero::getFightPower)));

        Map<String, Integer> highestHeroesFightPower = new LinkedHashMap<>();
        heroesNamesByStudio.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEachOrdered(e -> highestHeroesFightPower.put(e.getKey(), e.getValue()));

        System.out.println(highestHeroesFightPower);
    }

}
