package com.javachallengers.collections.generics;

public class GenericInstanceVariable<T>  {

  T t;

  public GenericInstanceVariable(T t) {
    this.t = t;
  }

  public static void main(String[] args) {
    GenericInstanceVariable<String> genericInstance =
        new GenericInstanceVariable<>("T type");
    String tString = genericInstance.t;
    System.out.println(tString);
  }

}
