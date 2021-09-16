package com.javachallengers.collections.map;

import static java.lang.System.out;

import java.util.HashMap;
import java.util.Map;

// Omitted imports
public class HashMapPutAllClear {

  public static Map<Integer, String> getFinalFantasyCharacters() {
    Map<Integer, String> map = new HashMap<>();                    // #A
    map.put(1, "Cloud");                                           // #B
    map.put(2, "Tifa");
    map.put(3, "Barret");
    return map;
  }

  public static Map<Integer, String> getMoreFinalFantasyCharacters() {
    Map<Integer, String> map = new HashMap<>();
    map.put(3, "Sephiroth");
    map.put(4, "Zack");
    map.put(5, "Aerith");
    return map;
  }

  public static void main(String[] args) {
    Map<Integer, String> ffCharacters = new HashMap<>();
    ffCharacters.put(1, "Cloud");
    ffCharacters.put(2, "Tifa");
    Map<Integer, String> moreFFCharacters = new HashMap<>();
    moreFFCharacters.put(2, "Sephiroth");
    moreFFCharacters.put(3, "Zack");
    moreFFCharacters.put(4, "Aerith");

    ffCharacters.putAll(moreFFCharacters);
    ffCharacters.forEach((k, v) -> out.print(" Key: " + k + " Value: " + v));

    ffCharacters.clear();
    ffCharacters.forEach((k, v) -> out.print(" Key: " + k + " Value: " + v));
  }
}