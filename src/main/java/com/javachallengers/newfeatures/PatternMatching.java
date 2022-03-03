package com.javachallengers.newfeatures;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class PatternMatching {

  @Test
  void instanceOfPreviousExample() {
    Object simpson = "Homer";

    if (simpson instanceof String) {
      String stringSimpson = (String) simpson;
      System.out.println(stringSimpson.getClass());
    }
  }

  @Test
  void patternMatchingExample() {
    Object simpson = "Homer";

    if (simpson instanceof String stringSimpson) {
      System.out.println(stringSimpson.getClass());
    }
  }

  @Test
  void patternMatchingAndExample() {
    Object simpsonCharacter = "Homer";
    if (simpsonCharacter instanceof String s && s.length() > 3) { }
  }

  @Test
  void patternMatchingOrExample() {
    Object simpsonCharacter = "Homer";
//    if (simpsonCharacter instanceof String s || s.length() > 3) { } Compilation error
  }

  @Test
  void scopePatternMatchingBooleanMethod() {
    System.out.println(scopePatternMatchingMethodReturnsValue());

    Object simpsonCharacter = "Homer";
    if (!(simpsonCharacter instanceof String s)) {
      System.out.println("");
    }
//    System.out.println(s.length() > 5); Compilation error
  }

  static boolean scopePatternMatchingMethodReturnsValue() {
    Object simpsonCharacter = "Homer";
    if (!(simpsonCharacter instanceof String s)) {
      return true;
    }
    return s.length() > 5;
  }

  static void scopePatternMatchingMethodDontReturnValue() {
    Object simpsonCharacter = "Homer";
    if (!(simpsonCharacter instanceof String s)) {
      System.out.println("Not instance of String");
    }
//    System.out.println(s); Compilation error here
  }

  @Test
  void scopePatternMatchingReturnValue() {
    Object simpsonCharacter = "Homer";
    if (!(simpsonCharacter instanceof String s)) {
//      System.out.println(s); Compilation error
    }
  }

  @Test
  void patternMatchingSwitchCase() {
    Object anyObject = 1;

    String numberType = switch(anyObject) {
      case Byte b -> b.getClass().toString();
      case Integer i -> i.getClass().toString();
      case BigDecimal b -> b.getClass().toString();
      case Object o  -> o.getClass().toString();
    };

    System.out.println(numberType);
  }

  @Test
  void patternMatchingSwitchCaseWithoutLambdaExpression() {
    System.out.println(getObjectTypeSwitchStatement());
  }

  Object getObjectTypeSwitchStatement() {
    Object anyObject = 1;

    switch(anyObject) {
      case Byte b: return b.getClass().toString();
      case Integer i: return i.getClass().toString();
      case BigDecimal b: return b.getClass().toString();
      case Object o: return o.getClass().toString();
    }
  }
}
