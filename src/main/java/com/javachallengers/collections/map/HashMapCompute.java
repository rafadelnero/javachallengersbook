package com.javachallengers.collections.map;

import static java.lang.System.out;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

// Omitted imports
public class HashMapCompute {

  public static Map<Integer, String> getFinalFantasyCharacters() {
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "Cloud");
    map.put(2, "Tifa");
    map.put(3, "Barret");
    return map;
  }

  public static void main(String[] args) {
    Map<Integer, String> ffCharacters = getFinalFantasyCharacters();
    ffCharacters.compute(1, (k,v) ->
        Optional.ofNullable(v).filter(e -> e.equals("Cloud"))
            .map(e -> e + " with Ultima Weapon").orElse("No weapon"));
    out.println(ffCharacters.get(1));
  }
}