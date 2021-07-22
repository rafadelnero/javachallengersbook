package com.javachallengers.collections.generics;

public class GenericsClass<T> {

  public static void main(String[] args) {
    GenericsClass<StringBuilder> genericClass = new GenericsClass<>();
    genericClass.doSomething(new StringBuilder("Generic StringBuilder"));
    new GenericsClass<>().doSomething("Generic String");
    Integer genericNumber = new GenericsClass<Integer>().doSomething(7);
    System.out.println(genericNumber);
  }

  public T doSomething(T type) {
    System.out.println(type.getClass());
    return type;
  }

}
