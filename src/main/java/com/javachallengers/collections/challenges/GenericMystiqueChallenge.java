package com.javachallengers.collections.challenges;

public class GenericMystiqueChallenge<T> {
  T t;
  public GenericMystiqueChallenge(T t) {
    this.t = t;
  }
  public<K> K mystiqueTransform(K k) {
    return k;
  }
  public <T> T mystiqueAttackPower(T t) {
    return t;
  }
  public static void main(String... doYourBest) {
    GenericMystiqueChallenge<String> genericMystique = new GenericMystiqueChallenge<>("Raven");

    String realName = genericMystique.t;
    String transformed = genericMystique.mystiqueTransform("Wolverine");
    Integer normalForm = genericMystique.mystiqueAttackPower(7);

    System.out.printf("%s %s %s", transformed, realName, normalForm);
  }

}
