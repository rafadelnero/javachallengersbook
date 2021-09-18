package com.javachallengers.collections.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapReverse {
  public static void main(String[] args) {
    Map<Integer, String> ffSummons = new TreeMap<>(Comparator.reverseOrder());
    ffSummons.put(3, "Shiva");
    ffSummons.put(2, "Jumbo Cactuar");
    ffSummons.put(1, "Siren");

    System.out.println(ffSummons);
  }
}