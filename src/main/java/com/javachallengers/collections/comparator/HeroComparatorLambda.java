package com.javachallengers.collections.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HeroComparatorLambda {
  private String name;
  private String power;

  public HeroComparatorLambda(String name, String power) {
    this.name = name;
    this.power = power;
  }

  public static void main(String[] args) {
    List<HeroComparatorLambda> heroes = new ArrayList<>();
    heroes.add(new HeroComparatorLambda("SpiderMan", "Web ball"));
    heroes.add(new HeroComparatorLambda("Iron Man", "Laser Beam"));

    heroes.sort((o1, o2) -> o1.name.compareTo(o2.name));
    for (var hero: heroes) { System.out.println(hero.name); }

    heroes.sort(Comparator.comparing(o -> o.name));
    for (var hero: heroes) { System.out.println(hero.name); }
  }
}
