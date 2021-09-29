package com.javachallengers.collections.search;

import java.util.Collections;
import java.util.List;

public class BinarySearchNotSorted {

  public static void main(String[] args) {
    List<String> ff8Fighters = List.of("Squall", "Zell", "Quistis");
    int searchIndex = Collections.binarySearch(ff8Fighters, "Quistis");
    System.out.println(ff8Fighters.get(searchIndex));
  }

}
