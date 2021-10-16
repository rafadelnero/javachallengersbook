package com.javachallengers.collections.generics;

import java.util.ArrayList;
import java.util.List;

public class CollectionWithoutGenerics {

  public static void main(String[] args) {
    List list = new ArrayList();                          // #A
    list.add("Duke");                                     // #B
    list.add(777);                                        // #C
    list.add(new Object());
    list.add(true);

    Integer luckyNumber = (Integer) list.get(1);          // #D
    System.out.println(luckyNumber);                     
  }

}
