package com.javachallengers.generics_obj_comparison.generics;

public class GenericsMethod {

  public <T> T doSomething(T type) {
    System.out.println(type.getClass());
    return type;
  }

  public static void main(String[] args) {
    GenericsMethod genericsMethod = new GenericsMethod();
    String result = genericsMethod.doSomething("Method with Generics");
    System.out.println(result);

    result = genericsMethod.<String>doSomething("Method with Generics");
    System.out.println(result);
  }

}
