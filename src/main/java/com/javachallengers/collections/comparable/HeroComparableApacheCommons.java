package com.javachallengers.collections.comparable;

import com.google.common.collect.ComparisonChain;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.builder.CompareToBuilder;

public class HeroComparableApacheCommons implements Comparable<HeroComparableApacheCommons> {

  private String name;
  private String power;

  public HeroComparableApacheCommons(String name, String power) {
    this.name = name;
    this.power = power;
  }

  public static void main(String[] args) {
    List<HeroComparableApacheCommons> heroes = new ArrayList<>();
    heroes.add(new HeroComparableApacheCommons("Iron Man", "Repulsor Ray"));
    heroes.add(new HeroComparableApacheCommons("Spider Man", "Webball"));
    heroes.add(new HeroComparableApacheCommons("Iron Man", null));
    heroes.add(new HeroComparableApacheCommons("Hulk", "Monstrous Swipe"));
    Collections.sort(heroes);
    System.out.println("HeroComparables:" + heroes);
  }

  @Override
  public int compareTo(HeroComparableApacheCommons o) {
    return new CompareToBuilder().append(name, o.name).append(power, o.power).toComparison();
  }

  @Override
  public String toString() {
    return "{name='" + name + "' , power='" + power + "'}";
  }

}
