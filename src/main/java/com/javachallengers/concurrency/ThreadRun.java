package com.javachallengers.concurrency;

public class ThreadRun {

  public static void main(String[] args) {
    Thread thread1 = new Thread(() -> System.out.println("Run Method 1: " + Thread.currentThread().getName()));
    Thread thread2 = new Thread(() -> System.out.println("Run Method 2: " + Thread.currentThread().getName()));

    thread1.run();
    thread1.run();
    thread2.run();
  }
}
