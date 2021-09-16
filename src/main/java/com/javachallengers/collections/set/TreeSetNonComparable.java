package com.javachallengers.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetNonComparable {
  public static void main(String... doYourBest) {
    Set<Simpson> set = new TreeSet<>();
    set.add(new Simpson("Homer "));
    set.add(new Simpson("Bart "));
    set.add(new Simpson("Maggie "));

    System.out.println(set);
  }
  static class Simpson {
    String name;
    public Simpson(String name) { this.name = name; }
    public String toString() { return this.name; }
  }
}
