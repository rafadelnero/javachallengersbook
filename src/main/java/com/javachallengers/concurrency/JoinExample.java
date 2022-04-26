package com.javachallengers.concurrency;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class JoinExample {

  @Test
  void notUsingJoin() {
    Thread thread1 = new Thread(() -> IntStream.rangeClosed(1, 5).forEach(System.out::print));
    Thread thread2 = new Thread(() -> IntStream.rangeClosed(6, 10).forEach(System.out::print));

    thread1.start();
    thread2.start();
  }

  @Test
  void usingJoin() throws InterruptedException {
    Thread thread1 = new Thread(() -> IntStream.rangeClosed(1, 5).forEach(System.out::print));
    Thread thread2 = new Thread(() -> IntStream.rangeClosed(6, 10).forEach(System.out::print));

    thread1.start();
    thread1.join();
    thread2.start();
    thread2.join();
  }
}
