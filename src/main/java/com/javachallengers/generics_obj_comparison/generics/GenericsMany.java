package com.javachallengers.generics_obj_comparison.generics;

public class GenericsMany <K, V, R>{

  public R doSomething(K k, V v) {
    System.out.printf("%s %s", k, v);
    return (R) new Object();
  }

  public static void main(String[] args) {
    GenericsMany<String, String, Integer> genericsMany = new GenericsMany();
    Integer test = genericsMany.doSomething("key", "value");
    System.out.println(test);
  }

}
