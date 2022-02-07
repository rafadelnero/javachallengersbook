package com.javachallengers.streams.collectors;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class toMap {

    class MarvelHero {
        private String name;
        private int age;

        public MarvelHero(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MarvelHero that = (MarvelHero) o;
            return age == that.age && Objects.equals(name, that.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return "MarvelHero{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    @Test
    void toMapExample() {
        List<MarvelHero> heroes = List.of(new MarvelHero("Spider-man", 21),
                new MarvelHero("Iron Man", 48),
                new MarvelHero("Doctor Strange", 36));

        Map<String, Integer> olderHeroes =  heroes.stream()
                .filter(h -> h.getAge() >= 30)
                .collect(Collectors.toMap(MarvelHero::getName, MarvelHero::getAge));

        System.out.println(olderHeroes);
    }

    @Test
    void toMapIdentityExample() {
        List<MarvelHero> heroes = List.of(new MarvelHero("Spider-man", 21),
                new MarvelHero("Iron Man", 48),
                new MarvelHero("Doctor Strange", 36));

        Map<String, MarvelHero> mapHeroes = heroes.stream()
                .collect(Collectors.toMap(MarvelHero::getName, Function.identity()));

        System.out.println(mapHeroes);
    }

    @Test
    void toMapDuplicateKey() {
        List<MarvelHero> heroes = List.of(new MarvelHero("Spider-man", 21),
                new MarvelHero("Spider-man", 21),
                new MarvelHero("Doctor Strange", 36));

        Map<String, MarvelHero> mapHeroes = heroes.stream()
                .collect(Collectors.toMap(MarvelHero::getName, Function.identity()));

        System.out.println(mapHeroes);
    }

    @Test
    void toMapDuplicateKeyDistinct() {
        List<MarvelHero> heroes = List.of(new MarvelHero("Spider-man", 21),
                new MarvelHero("Spider-man", 21),
                new MarvelHero("Doctor Strange", 36));

        Map<String, MarvelHero> mapHeroes = heroes.stream().distinct()
                .collect(Collectors.toMap(MarvelHero::getName, Function.identity()));

        System.out.println(mapHeroes);
    }

    @Test
    void toMapDuplicateKeyMerge() {
        List<MarvelHero> heroes = List.of(new MarvelHero("Spider-man", 21),
                new MarvelHero("Spider-man", 21),
                new MarvelHero("Doctor Strange", 36));

        Map<String, Integer> mergedMapValues  = heroes.stream()
                .collect(Collectors.toMap(MarvelHero::getName,
                                MarvelHero::getAge,
                                (value1FromDuplicate, value2FromDuplicate) ->
                                        value1FromDuplicate + value2FromDuplicate)
                );
        System.out.println(mergedMapValues);
    }

    @Test
    void toMapDuplicateKeyMergeMethodReference() {
        List<MarvelHero> heroes = List.of(new MarvelHero("Spider-man", 21),
                new MarvelHero("Spider-man", 21),
                new MarvelHero("Doctor Strange", 36));

        Map<String, Integer> mergedMapValues  = heroes.stream()
                .collect(Collectors.toMap(MarvelHero::getName,
                        MarvelHero::getAge, Integer::sum)
                );
        System.out.println(mergedMapValues);
    }

    @Test
    void toMapDuplicateKeyMergeLinkedHashMap() {
        List<MarvelHero> heroes = List.of(new MarvelHero("Spider-man", 21),
                new MarvelHero("Xavier", 60),
                new MarvelHero("Ant-Man", 25));
        Map<String, Integer> linkedHashMap  = heroes.stream()
                .collect(Collectors.toMap(MarvelHero::getName,
                        MarvelHero::getAge, Integer::sum,
                        LinkedHashMap::new
                ));
        System.out.println(linkedHashMap);
    }

    @Test
    void toMapDuplicateKeyMergeTreeMap() {
        List<MarvelHero> heroes = List.of(new MarvelHero("Spider-man", 21),
                new MarvelHero("Xavier", 60),
                new MarvelHero("Ant-Man", 25));
        Map<String, Integer> treeMap  = heroes.stream()
                .collect(Collectors.toMap(MarvelHero::getName,
                        MarvelHero::getAge, Integer::sum,
                        TreeMap::new
                ));
        System.out.println(treeMap);
    }
}
