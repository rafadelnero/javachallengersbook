package com.javachallengers.collections.challenges;

public class SpiderEqualChallenge {

  public static void main(String... doYourBest) {
    System.out.println(new SpiderMan("Bart").equals(new SpiderMan("Bart")));
  }

  static class SpiderMan {
    String name;

    SpiderMan(String name) {
      this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
      SpiderMan otherSpiderMan = (SpiderMan) obj;
      return this.name.equals(otherSpiderMan.name) &&
          this.hashCode() == otherSpiderMan.hashCode();
    }

    @Override
    public int hashCode() {
      return (43 + 777);
    }
  }
}
