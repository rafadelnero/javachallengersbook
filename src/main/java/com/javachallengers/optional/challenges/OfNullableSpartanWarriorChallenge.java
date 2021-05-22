package com.javachallengers.optional.challenges;

import java.util.Optional;

public class OfNullableSpartanWarriorChallenge {

  public static void main(String ... doYourBest) {
    boolean isWarriorPresent = getOfWarrior("Kratos").isPresent();

    Optional<Object> spartanGhost = Optional.empty();
    Optional<String> ofNullableWarrior = getOptWarrior();
    Optional<Object> emptyWarrior = Optional.of("");

    System.out.printf("%s %s %s %s", isWarriorPresent,
        spartanGhost, ofNullableWarrior, emptyWarrior.isEmpty());
    System.out.println(getOfWarrior(null));
  }

  static Optional<String> getOfWarrior(String name) {
    return Optional.of(name);
  }
  static Optional<String> getOptWarrior() {
      return Optional.ofNullable(null);
  }

}
