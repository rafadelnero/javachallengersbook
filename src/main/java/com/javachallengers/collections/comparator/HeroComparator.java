package com.javachallengers.collections.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HeroComparator {
  private String name;
  private String power;
  
  public HeroComparator(String name, String power) {
    this.name = name;
    this.power = power;
  }

  public static void main(String[] args) {
    List<HeroComparator> heroes = new ArrayList<>();
    heroes.add(new HeroComparator("SpiderMan", "Web ball"));
    heroes.add(new HeroComparator("Iron Man", "Laser Beam"));
    heroes.sort(new Comparator<HeroComparator>() {
      @Override
      public int compare(HeroComparator o1, HeroComparator o2) {
        return o1.name.compareTo(o2.name);
      }
    });
    for (var hero: heroes) { System.out.println(hero.name); }
  }
}
