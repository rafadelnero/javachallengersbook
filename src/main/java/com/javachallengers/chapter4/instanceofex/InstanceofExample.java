package com.javachallengers.chapter4.instanceofex;

public class InstanceofExample {

  public static void main(String[] args) {
    Object xavier = new Xavier();
    System.out.println(new Venom() instanceof Object); // It prints true
    System.out.println(xavier instanceof Xavier && xavier instanceof Object); // It prints true
    System.out.println(new Wolverine() instanceof Hero); // It prints true
    System.out.println(new Hero() instanceof Wolverine); // It prints false
  }

}

class Hero {}
class Venom {}
class Xavier {}
class Wolverine extends Hero {}
