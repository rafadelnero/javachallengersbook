package com.javachallengers.collections.challenges;

public class SpiderEqualChallenge {
  static int equalsCount = 0;
  public static void main(String... doYourBest) {
    System.out.println(areEquals(new SpiderMan("Peter"), new SpiderMan("Peter")));
    SpiderMan symbiote = new SpiderMan("Symbiote") {
      public int hashCode() { return 43 + 777 + 1; }
    };
    System.out.println(areEquals(symbiote, new SpiderMan("Symbiote")));
    System.out.println(equalsCount);
  }
  static boolean areEquals(SpiderMan spiderMan1, SpiderMan spiderMan2) {
    return spiderMan1.hashCode() == spiderMan2.hashCode()
        && spiderMan1.equals(spiderMan2);
  }
  static class SpiderMan {
    String name;
    SpiderMan(String name) {
      this.name = name;
    }
    public boolean equals(Object obj) {
      final var spiderMan = (SpiderMan) obj;
      equalsCount++;
      return name.equals(spiderMan.name);
    }
    public int hashCode() {
      return (43 + 777);
    }
  }
}
