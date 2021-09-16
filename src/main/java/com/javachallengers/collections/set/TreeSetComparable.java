package com.javachallengers.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetComparable {
  public static void main(String... doYourBest) {
    Set<Simpson> set = new TreeSet<>();
    set.add(new Simpson("Homer "));
    set.add(new Simpson("Bart "));
    set.add(new Simpson("Maggie "));

    System.out.println(set);
  }
  static class Simpson implements Comparable<Simpson> {
    String name;
    public Simpson(String name) { this.name = name; }
    public String toString() { return this.name; }

    @Override
    public int compareTo(Simpson o) {
      return this.name.compareTo(o.name);
    }
  }
}
