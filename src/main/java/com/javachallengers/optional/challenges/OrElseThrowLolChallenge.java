package com.javachallengers.optional.challenges;

import java.util.Optional;

public class OrElseThrowLolChallenge {

  public static void main(String... doYourBest) throws Throwable {
    String finalOpt = "finalLol";
    Optional<String> opt = null;

    try {
      opt = Optional.of(null);
    } catch (RuntimeException exception) {
      System.out.println(opt.orElseThrow(() -> new Throwable()));
    } catch (Throwable error) {
      finalOpt = opt.orElse("lol");
    }

    System.out.println(finalOpt);
  }

}
