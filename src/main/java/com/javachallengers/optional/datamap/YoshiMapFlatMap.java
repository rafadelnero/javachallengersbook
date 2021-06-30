package com.javachallengers.optional.datamap;

import java.util.Optional;

public class YoshiMapFlatMap {

  public static void main(String[] args) {
    Yoshi yoshi = new Yoshi(7);
    yoshiMap(yoshi);
    yoshiFlatMap(yoshi);
  }

  public static void yoshiFlatMap(Yoshi yoshi) {
    Optional<Integer> eatenApples = Optional.of(yoshi).flatMap(Yoshi::getEatenApples);
    System.out.println(eatenApples);
  }

  public static void yoshiMap(Yoshi yoshi) {
    Optional<Optional<Integer>> optEatenApples = Optional.of(yoshi).map(Yoshi::getEatenApples);
    Integer eatenApples = optEatenApples.orElseThrow().orElse(0);
    System.out.println(eatenApples);
  }

  static class Yoshi {
    private Integer eatenApples;
    public Yoshi(Integer eatenApples) {
      this.eatenApples = eatenApples;
    }
    public Optional<Integer> getEatenApples() {
      return Optional.ofNullable(eatenApples);
    }
  }
}




