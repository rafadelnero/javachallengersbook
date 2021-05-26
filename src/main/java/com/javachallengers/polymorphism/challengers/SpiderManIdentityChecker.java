package com.javachallengers.polymorphism.challengers;

public class SpiderManIdentityChecker {

  public static void main(String... doYourBest) {
    System.out.println(new SpiderMan("Peter").equals(new SpiderMan("Peter")));
    System.out.println(new SpiderMan("Peter").equals(new SpiderMan("Parker")));
  }

}

class SpiderMan {
  String name;
  SpiderMan(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(final Object obj) {
    return this.equals(obj);
  }

}
