package com.javachallengers.collections.comparable;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HeroComparableGuava implements Comparable<HeroComparableGuava> {

  private String name;
  private String power;

  public HeroComparableGuava(String name, String power) {
    this.name = name;
    this.power = power;
  }

  public static void main(String[] args) {
    List<HeroComparableGuava> heroes = new ArrayList<>();
    heroes.add(new HeroComparableGuava("Iron Man", "Repulsor Ray"));
    heroes.add(new HeroComparableGuava("Spider Man", "Webball"));
    heroes.add(new HeroComparableGuava("Iron Man", null));
    heroes.add(new HeroComparableGuava("Hulk", "Monstrous Swipe"));
    Collections.sort(heroes);
    System.out.println("HeroComparables:" + heroes);
  }

  @Override
  public int compareTo(HeroComparableGuava o) {
    return ComparisonChain.start().compare(name, o.name, Ordering.natural().nullsLast())
        .compare(power, o.power, Ordering.natural().nullsLast()).result();
  }

  @Override
  public String toString() {
    return "{name='" + name + "' , power='" + power + "'}";
  }

}
