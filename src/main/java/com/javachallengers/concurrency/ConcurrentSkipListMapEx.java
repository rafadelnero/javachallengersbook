package com.javachallengers.concurrency;

import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapEx {

  public static void main(String[] args) {
    ConcurrentNavigableMap<Integer, String> xmen = new ConcurrentSkipListMap<>();
    xmen.put(3, "Xavier");
    xmen.put(2, "Wolverine");
    xmen.put(1, "Cyclops");

    xmen.forEach((k, v) -> System.out.println(k +" : " + v));
  }
}
