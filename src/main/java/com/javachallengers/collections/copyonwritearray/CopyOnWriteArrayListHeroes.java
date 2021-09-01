package com.javachallengers.collections.copyonwritearray;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListHeroes {

  public static void main(String[] args) {
    List<String> heroes = new CopyOnWriteArrayList<>();
    heroes.add("Iron Man");
    heroes.add("Spider Man");

    LinkedHashSet fdsa;

    var heroToRemove = "Iron Man";

    for (String eachHero: heroes) {
      if (eachHero.equals(heroToRemove)) {
        heroes.remove(heroToRemove);
        heroes.add("Batman");
      }
    }

    System.out.println(heroes);
  }
}
