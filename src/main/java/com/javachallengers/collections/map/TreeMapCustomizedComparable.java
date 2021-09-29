package com.javachallengers.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapCustomizedComparable {
  public static void main(String[] args) {
    Map<Summon, String> ffSummons = new TreeMap<>();
    ffSummons.put(new Summon("Tonberry"), "Guardian Force");
    ffSummons.put(new Summon("MiniMog"), "Guardian Force");
    ffSummons.put(new Summon("Carbuncle"), "Guardian Force");

    System.out.println(ffSummons);
  }

  static class Summon implements Comparable<Summon> {
    private String name;
    public Summon(String name) {
      this.name = name;
    }

    public int compareTo(Summon o) {
      return this.name.compareTo(o.name);
    }
    public String toString() {
      return "Summon{" + "name='" + name + '\'' +'}';
    }
  }
}