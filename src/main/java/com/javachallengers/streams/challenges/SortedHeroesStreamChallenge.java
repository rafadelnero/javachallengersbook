package com.javachallengers.streams.challenges;

import java.util.List;

public class SortedHeroesStreamChallenge {

    public static void main(String... doYourBest) {
        List<Hero> heroesList = List.of(new Hero("Spider Man"), new Hero("Wolverine"),
                new Hero("Batman"), new Hero("Iron Man"), new Hero("Beast"));

        heroesList.stream()
                .sorted()
                .forEach(h -> System.out.print(h.name + " "));
    }

    static class Hero {
        private String name;
        Hero(String name) {
            this.name = name;
        }
    }

}