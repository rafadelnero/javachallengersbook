package com.javachallengers.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HeroComparable implements Comparable<HeroComparable> {

  private String name;
  private String power;

  public HeroComparable(String name, String power) {
    this.name = name;
    this.power = power;
  }

  public static void main(String[] args) {
    List<HeroComparable> heroes = new ArrayList<>();
    heroes.add(new HeroComparable("Iron Man", "Repulsor Ray"));
    heroes.add(new HeroComparable("Spider Man", "Webball"));
    heroes.add(new HeroComparable("Iron Man", "Laser Beam"));
    heroes.add(new HeroComparable("Hulk", "Monstrous Swipe"));
    Collections.sort(heroes);
    System.out.println("HeroComparables:" + heroes);
  }

  @Override
  public int compareTo(HeroComparable o) {
    int i = name.compareTo(o.name);
    if (i != 0) return i;

    return power.compareTo(o.power);
  }

  @Override
  public String toString() {
    return "{name='" + name + "' , power='" + power + "'}";
  }
}
