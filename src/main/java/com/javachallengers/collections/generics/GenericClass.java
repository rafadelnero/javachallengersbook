package com.javachallengers.collections.generics;

public class GenericClass<T> {

  public static void main(String[] args) {
    GenericClass<StringBuilder> genericClass = new GenericClass<>();
    genericClass.doSomething(new StringBuilder("Generic StringBuilder"));
    new GenericClass<>().doSomething("Generic String");
    Integer genericNumber = new GenericClass<Integer>().doSomething(7);
    System.out.println(genericNumber);
  }

  public T doSomething(T type) {
    System.out.println(type.getClass());
    return type;
  }

}
