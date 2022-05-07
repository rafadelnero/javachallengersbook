package com.javachallengers.concurrency;

import java.util.stream.IntStream;

public class RaceConditionExample {

  private int counter = 0;

  public  void incrementCounter() {
    try {
      Thread.sleep(10);
      counter++;
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public int getCounter() {
    return counter;
  }

  public static void main(String... args)  {
    RaceConditionExample raceCondition = new RaceConditionExample();
    IntStream.rangeClosed(1, 5).forEach(i -> {
      Thread thread = new Thread(() -> {
        raceCondition.incrementCounter();
        System.out.println(Thread.currentThread().getName() + ":" + raceCondition.getCounter());
      });

      thread.start();
    });
  }

}
