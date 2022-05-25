package com.javachallengers.concurrency.volatilevar;

public class WithVolatileSolution {

  private static volatile boolean ready = false;
  public static void main(String[] args) {
    new Thread(() -> {
      for (int i = 1; i <= 5; i++){
        System.out.println("First thread - Value of i: " + i);
      }
      ready = true;
      System.out.println("Changed ready flag: " + ready);
    }).start();

    new Thread(() -> {
      int i = 1;
      while (!ready) {
        i++;
      }
      System.out.println("Second thread - Value of i: " + i);
    }).start();
  }
}
