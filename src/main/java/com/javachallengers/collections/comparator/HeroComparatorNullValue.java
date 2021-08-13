package com.javachallengers.collections.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HeroComparatorNullValue {

  private String name;
  private String power;

  public HeroComparatorNullValue(String name, String power) {
    this.name = name;
    this.power = power;
  }

  public static void main(String[] args) {
    List<HeroComparatorNullValue> heroes = new ArrayList<>();
    heroes.add(new HeroComparatorNullValue(null, "Web ball"));
    heroes.add(new HeroComparatorNullValue("Iron Man", "Laser Beam"));
    heroes.add(new HeroComparatorNullValue("Iron Man", null));

    Comparator<HeroComparatorNullValue> employeeNameComparator
        = Comparator.comparing(HeroComparatorNullValue::getName,
        Comparator.nullsFirst(String::compareTo));

    heroes.sort(employeeNameComparator);
    heroes.forEach(System.out::println);
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "HeroComparatorNullValue{name='" + name + ", power='" + power + '}';
  }
}
