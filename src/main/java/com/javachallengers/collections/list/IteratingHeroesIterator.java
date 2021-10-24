package com.javachallengers.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingHeroesIterator {

    public static void main(String[] args) {
        List<String> heroes = new ArrayList<>();
        heroes.add("Batman");
        heroes.add("Spider-Man");
        heroes.add("Iron Man");

        // Iterator to traverse the list
        Iterator iterator = heroes.iterator();

        // Verifies if there is a next element in the iterator
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
    }
}
