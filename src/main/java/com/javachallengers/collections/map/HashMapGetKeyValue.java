package com.javachallengers.collections.map;

import static java.lang.System.out;

import java.util.HashMap;
import java.util.Map;

// Omitted imports
public class HashMapGetKeyValue {

  public static Map<Integer, String> getFinalFantasyCharacters() {
    Map<Integer, String> map = new HashMap<>();                    // #A
    map.put(1, "Cloud");                                           // #B
    map.put(2, "Tifa");
    map.put(3, "Barret");
    return map;
  }

  public static void main(String[] args) {
    Map<Integer, String> map = getFinalFantasyCharacters();

    out.println(map.get(1));
    out.println(map.getOrDefault(4, "Vincent"));
    out.println(map.values());
    out.println(map.keySet());
  }
}