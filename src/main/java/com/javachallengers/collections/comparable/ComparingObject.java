package com.javachallengers.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparingObject {

  public static void main(String[] args) {
    List<Object> heroes = new ArrayList<>();
    heroes.add("Hulk");
    heroes.add("Captain America");
    heroes.add("Thor");

    // Collections.sort(heroes); Doesn't compile because Object doesn't implement Comparable
  }

}
