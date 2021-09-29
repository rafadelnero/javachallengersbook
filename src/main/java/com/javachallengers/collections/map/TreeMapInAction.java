package com.javachallengers.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapInAction {
  public static void main(String[] args) {
    Map<Integer, String> ffSummons = new TreeMap<>();
    ffSummons.put(3, "Shiva");
    ffSummons.put(2, "Cactuar");
    ffSummons.put(1, "Siren");

    System.out.println(ffSummons);
  }
}