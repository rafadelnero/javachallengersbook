package com.javachallengers.concurrency;

import java.util.stream.IntStream;

public class NonDaemonWithNonDaemon {

  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName() + " is running..." +
            " isDaemon:" + Thread.currentThread().isDaemon());

    Thread nonDaemonThread = new Thread(() -> IntStream.rangeClosed(1, 10)
            .forEach(i -> System.out.print(Thread.currentThread().getName() + " count is: " + i + " | ")));
    System.out.println("Is daemon: " + nonDaemonThread.isDaemon());
    nonDaemonThread.start();
  }
}
