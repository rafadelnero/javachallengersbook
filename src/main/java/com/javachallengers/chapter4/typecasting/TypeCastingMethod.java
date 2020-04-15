package com.javachallengers.chapter4.typecasting;

public class TypeCastingMethod {

  public static void main(String... drinkBeer) {
      drinkBeer(new Homer());
  }

  static void drinkBeer(Character character) {
      // character.drinkBeer(); It won't compile since Character doesn't have this method
  }
}

class Character {
}

class Homer extends Character {
    void drinkBeer() {
	System.out.println("Homer drinks a beer");
    }
 }
