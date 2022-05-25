package com.javachallengers.concurrency.challenges;

public class VolatileChallenge {

    private static int counter = 0;
    private

    static void incrementCounter() {
      try {
        Thread.sleep(10);
        counter++;
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    public static void main(String[] args) {
      new Thread(() -> {
        for (int i = 0; i < 5; i++) {
          incrementCounter();
          System.out.println(counter);
        }
      }).start();

      new Thread(() -> {
        for (int i = 0; i < 5; i++) {
          incrementCounter();
          System.out.println(counter);
        }
      }).start();

      System.out.println("Last:" + counter);
    }
}
