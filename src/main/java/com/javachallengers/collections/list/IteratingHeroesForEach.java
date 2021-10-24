package com.javachallengers.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingHeroesForEach {

    public static void main(String[] args) {
        List<String> heroes = new ArrayList<>();
        heroes.add("Batman");
        heroes.add("Spider-Man");
        heroes.add("Iron Man");

        for (String hero : heroes) System.out.print(hero + " ");
    }
}
