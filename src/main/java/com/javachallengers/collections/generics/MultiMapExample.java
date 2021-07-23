package com.javachallengers.collections.generics;

import java.util.Deque;

public class MultiMapExample {

  public static void main(String[] args) {
    MultiMap<Integer, Double, String> multiMap = (key, value) -> String.valueOf(key + value);
    System.out.println(multiMap.put(1, 2.0));
  }

  interface MultiMap <K,V, R>  {
    R put(K k, V v);
  }
}


