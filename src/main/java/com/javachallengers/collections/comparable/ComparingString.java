package com.javachallengers.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparingString {

  public static void main(String[] args) {
    List<String> heroes = new ArrayList<>();
    heroes.add("Spider Man");
    heroes.add("Iron Man");
    heroes.add("Hulk");
    heroes.add("Captain America");
    heroes.add("Doctor Strange");

    Collections.sort(heroes);

    System.out.println(heroes);
  }

}
