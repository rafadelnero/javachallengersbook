package com.javachallengers.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapIterateValues {

  public static void main(String[] args) {
    Map<Integer, String> avalanche = new HashMap<>();
    avalanche.put(1, "Cloud");
    avalanche.put(2, "Barret");
    avalanche.put(3, "Tifa");

    iterateWithKeySet(avalanche);
  }

  static void iterateWithEntrySetIterator(Map<Integer, String> avalanche) {
    Iterator<Entry<Integer, String>> it = avalanche.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry<Integer, String> entry = it.next();
      System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
    }
  }

  static void iterateWithEnhancedFor(Map<Integer, String> avalanche) {
    String result = "";
    for (Map.Entry<Integer, String> entry : avalanche.entrySet()) {
      System.out.println("Key:" + entry.getKey() + " Value: " + entry.getValue());
    }
  }

  static void iterateWithForEach(Map<Integer, String> avalanche) {
    avalanche.forEach((k, v) -> System.out.println("Key:" + k + " Value: " + v));
  }

  static void iterateWithKeySet(Map<Integer, String> avalanche) {
    for (int key : avalanche.keySet()) {
      System.out.println("Key:" + key + " Value:" + avalanche.get(key));
    }
  }

}
