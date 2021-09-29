package com.javachallengers.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExceptionCase {
  public static void main(String[] args) {
    Map<Summon, Integer> ffSummons = new TreeMap<>();
    ffSummons.put(new Summon("Carbuncle"), 1);
    ffSummons.put(new Summon("MiniMog"), 2);
    ffSummons.put(new Summon("Tonberry"), 3);

    System.out.println(ffSummons);
  }
}

class Summon {
  private String name;
  public Summon(String name) {
    this.name = name;
  }
}