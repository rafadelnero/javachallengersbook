package com.javachallengers.collections.immutability;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ImmutableList {

  public static void main(String[] args) {
    List<String> heroes = List.of("Batman", "Super Man", "Wonder Woman");
//    heroes.add("Robin");

    heroes = new ArrayList<>(heroes);
    heroes.add("Robin");
    heroes.forEach(System.out::println);

    List<String> otherHeroes = Arrays.asList("Batman", "Super Man", "Wonder Woman");
    otherHeroes.add("Robin");
  }

}
