package com.javachallengers.concurrency;

import java.util.stream.IntStream;

public class NonDaemonWithDaemon {

  public static void main(String[] args) throws InterruptedException {
    System.out.println(Thread.currentThread().getName() + " is running..." +
            " isDaemon:" + Thread.currentThread().isDaemon());

    Thread daemonThread = new Thread(() -> IntStream.rangeClosed(1, 100)
            .forEach(i -> System.out.println(Thread.currentThread().getName() + " count is: " + i)));
    daemonThread.setDaemon(true);

    daemonThread.start();
    Thread.sleep(1);
  }
}
