package com.javachallengers.collections.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapReverse {
  public static void main(String[] args) {
    Map<Integer, String> ffSummons = new TreeMap<>(Comparator.reverseOrder());
    ffSummons.put(1, "Siren");
    ffSummons.put(2, "Cactuar");
    ffSummons.put(3, "Shiva");

    System.out.println(ffSummons);
  }
}