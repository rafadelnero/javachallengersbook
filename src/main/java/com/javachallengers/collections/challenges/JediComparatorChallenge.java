package com.javachallengers.collections.challenges;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class JediComparatorChallenge {
    public static void main(String... doYourBest) {
      List<Jedi> jediList = new ArrayList<>();
      jediList.add(new Jedi("Anakin", 10));
      jediList.add(new Jedi("Luke", 5));
      jediList.add(new Jedi("Luke", 6));
      jediList.add(new Jedi("Obi Wan", 7));

      Comparator<Jedi> comparator = Comparator
              .comparing(Jedi::getName)
              .thenComparing((a1,a2) -> a2.age.compareTo(a1.getAge()));

      jediList.sort(comparator);
      jediList.forEach(j -> System.out.println(j.name + ":" + j.age));
    }
    static class Jedi {
      String name;
      Integer age;
      public Jedi(String name, Integer age) { this.name = name; this.age = age; }
      public String getName() { return name; }
      public Integer getAge() { return age;  }
    }
}
