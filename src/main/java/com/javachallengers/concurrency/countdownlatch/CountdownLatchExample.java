package com.javachallengers.concurrency.countdownlatch;

import java.time.LocalDateTime;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CountdownLatchExample {

  public static void main(String[] args) throws InterruptedException {
    CountDownLatch countDownLatch = new CountDownLatch(3);

    ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
    Runnable task = () -> {
      System.out.println("Never stop learning! " + LocalDateTime.now());
      countDownLatch.countDown();
    };
    executor.scheduleAtFixedRate(task, 1, 1, TimeUnit.SECONDS);

    countDownLatch.await();
    executor.shutdown();
  }

}
