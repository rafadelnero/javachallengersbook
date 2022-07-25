package com.javachallengers.concurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.junit.jupiter.api.Test;

public class ConcurrentHashMapEx {

  @Test
  public void removeElementsFromConcurrentHashMap() {
    Map<Integer, String> map = new ConcurrentHashMap<>(Map.of(1, "Duke", 2, "Juggy"));

    for (int key : map.keySet()) {
      map.remove(1);
    }

    System.out.println(map);
  }

  @Test
  public void removeElementsFromHashMap() {
    Map<Integer, String> map = new HashMap<>(Map.of(1, "Duke", 2, "Juggy"));

    for (int key : map.keySet()) {
      map.remove(1);
    }

    System.out.println(map);
  }

  @Test
  public void removeIfConcurrentHashMap() {
    Map<Integer, String> map = new ConcurrentHashMap<>(Map.of(1, "Duke", 2, "Juggy"));
    map.keySet().removeIf((k) -> k == 1);
    System.out.println(map);
  }
}
