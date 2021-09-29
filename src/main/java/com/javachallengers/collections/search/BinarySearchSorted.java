package com.javachallengers.collections.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.TreeMap;

public class BinarySearchSorted {

  public static void main(String[] args) {
    List<String> ff8Fighters = new ArrayList<>(List.of("Squall", "Zell", "Quistis"));
    Collections.sort(ff8Fighters);
    int searchIndex = Collections.binarySearch(ff8Fighters, "Quistis");
    System.out.println(ff8Fighters.get(searchIndex));
  }

}
