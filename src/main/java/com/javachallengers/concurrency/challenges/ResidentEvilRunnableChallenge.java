package com.javachallengers.concurrency.challenges;

public class ResidentEvilRunnableChallenge {

  public static void main(String[] args) {
    Thread leonThread = new Thread(() -> System.out.println("Shoots Super Tyrant"));
    Thread claireThread = new Thread(() -> System.out.println("Shoots G4"));

    leonThread.start();
    claireThread.start();
    Thread chrisThread = claireThread;
    chrisThread.start();
  }

}
