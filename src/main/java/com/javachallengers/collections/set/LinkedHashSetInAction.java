package com.javachallengers.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetInAction {
  public static void main(String[] args) {
    Set<String> heroes = new LinkedHashSet<>();
    heroes.add("Batman");
    heroes.add("Batman");
    heroes.add("Doctor Strange");
    heroes.add("Wolverine");
    heroes.add("Spider Man");
    heroes.add(null);

    System.out.println(heroes);
  }
}
