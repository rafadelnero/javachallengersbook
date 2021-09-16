package com.javachallengers.collections.map;

import static java.lang.System.out;
import java.util.HashMap;
import java.util.Map;

public class HashMapPutRemove {
  public static Map<Integer, String> getFinalFantasyCharacters() {
    Map<Integer, String> map = new HashMap<>();                    // #A
    map.put(1, "Cloud");                                           // #B
    map.put(2, "Tifa");
    map.put(3, "Barret");
    return map;
  }
  public static void main(String[] args) {
    Map<Integer, String> map = getFinalFantasyCharacters();                   

    out.println(map.remove(2));                                    // #C
    out.println(map.putIfAbsent(2, "Vincent"));                    // #D
    out.println(map.keySet());                                     // #E

    for (Map.Entry<Integer,String> entry : map.entrySet())         // #F
      System.out.println("Key = " + entry.getKey() +               // #G
                         ", Value = " + entry.getValue());         // #H
  }
}