package com.javachallengers.collections.map;

import static java.lang.System.out;

import java.util.LinkedHashMap;
import java.util.Map;

// Omitted imports
public class LinkedHashMapInAction {
  public static void main(String[] args) {
    Map<Integer, String> map = new LinkedHashMap<>();

    for (var i = 0; i <= 10; i++) {
      map.put(i, "Element:" + i);
    }
    out.println(map);
  }
}