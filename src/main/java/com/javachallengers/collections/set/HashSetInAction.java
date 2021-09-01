package com.javachallengers.collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetInAction {
  public static void main(String[] args) {
    Set<String> heroes = new HashSet<>();
    heroes.add("Batman");
    heroes.add("Batman");
    heroes.add("Doctor Strange");
    heroes.add("Wolverine");

    System.out.println(heroes);
  }
}
