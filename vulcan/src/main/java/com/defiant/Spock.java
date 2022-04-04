package com.defiant;

public class Spock implements Captain {

  public void attack(String shipName) {
    if (shipName.equals("reliant"))
      System.out.println("The ship is destroyed");
    else {
      throw new StackOverflowError("Non-existent ship");
    }
  }

  private void doh() {
    System.out.println("Hey, this is from the Simpsons!");
  }

}


