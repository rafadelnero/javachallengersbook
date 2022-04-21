package com.javachallengers.concurrency.challenges;

public class HeisenbergStartChallenge {

  public static void main(String... doYourBest)
          throws InterruptedException {
    Thread heisenberg = new Heisenberg();

    heisenberg.start();
    heisenberg.run();
    heisenberg.run();
    heisenberg.start();
  }

  static class Heisenberg extends Thread {
    public void run() {
      System.out.println("I am the danger!");
    }
  }
}
