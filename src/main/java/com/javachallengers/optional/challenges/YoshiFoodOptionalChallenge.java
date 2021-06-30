package com.javachallengers.optional.challenges;

import java.util.Optional;

public class YoshiFoodOptionalChallenge {

  public static void main(String... yoshiFood) {
    Integer yoshiFoodCount;
    Object isYoshiFoodEmpty;
    Optional<Integer> optYoshi = Optional.ofNullable(0);

    try {
      yoshiFoodCount = optYoshi.orElseThrow();
    } finally {
      isYoshiFoodEmpty = Optional.ofNullable(null)
          .filter(y -> y == Optional.empty()).orElse(Boolean.FALSE);
    }
    Optional<Integer> test = Optional.of("Apple").map(String::length);
    System.out.println(test);
    boolean isApple = Optional.of("Apple").flatMap(a -> Optional.of("APPLE"))
                                .equals(Optional.of("APPLE"));

    optYoshi.ifPresentOrElse(System.out::print, Optional.ofNullable(null)::get);
    System.out.printf("%s %s %s", yoshiFoodCount, isYoshiFoodEmpty, isApple);
  }
}

