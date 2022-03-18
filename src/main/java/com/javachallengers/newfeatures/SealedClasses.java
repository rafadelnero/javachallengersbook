package com.javachallengers.newfeatures;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SealedClasses {

  sealed class Aircraft {}

  //sealed class Car { } Compilation error

//  sealed class Car permits Ferrari {}
//
//  class Ferrari extends Car {
//
//  }

  sealed interface Car permits Ferrari, Porsche { }

  non-sealed class Ferrari implements Car {}

  final class Porsche implements Car {}

  final class Airplane extends Aircraft { }

  non-sealed class Helicopter extends Aircraft { }

  final class BellAH1Cobra extends Helicopter { }

  @Test
  void sealedClassesReflection() {
    System.out.println(Car.class.isSealed());
    System.out.println(Arrays.toString(Car.class.getPermittedSubclasses()));
  }

  @Test
  void sealedClassesPatternMatching() {
    Car car = new Ferrari();
    switch (car) {
      case Ferrari f -> System.out.println(f.getClass().getSimpleName());
      case Porsche p -> System.out.println(p.getClass().getSimpleName());
    }
  }

  @Test
   void anonymousInnerSealedClasses() {
//    new Car() { }; Compilation error
  }

}

class SealedInterfaceWithRecord {

  sealed interface Car permits Ferrari, Porsche { }

  record Ferrari() implements Car {}

  record Porsche() implements Car {}

}

class SealedClassWithRecord {

//  sealed class Car permits Ferrari { }
//
//  record Ferrari() extends Car { }

}
