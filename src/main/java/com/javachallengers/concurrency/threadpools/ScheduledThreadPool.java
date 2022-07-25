package com.javachallengers.concurrency.threadpools;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.units.qual.C;

public class ScheduledThreadPool {

  public static void main(String[] args) throws InterruptedException, ExecutionException {
//    normalThreadPoolExecutorTest();
//    fixedRateThreadPoolExecutorTest();

    fixedDelayThreadPoolExecutorTest();
  }

  public static void normalThreadPoolExecutorTest() {
    ScheduledThreadPoolExecutor threadPool = new ScheduledThreadPoolExecutor(2);

    Runnable task = () -> System.out.println(Thread.currentThread().getName());
    for (int i = 0; i < 4; i++) {
      threadPool.schedule(task, 1,  TimeUnit.SECONDS);
    }

    threadPool.shutdown();
  }

  public static void fixedRateThreadPoolExecutorTest() {
    ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
    Runnable task = () -> {
      System.out.println("Never stop learning! " + LocalDateTime.now());
      try { Thread.sleep(1000); } catch (InterruptedException e) {}
    };
    executor.scheduleAtFixedRate(task, 1, 1, TimeUnit.SECONDS);
  }

  public static void fixedDelayThreadPoolExecutorTest() throws InterruptedException {
    ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);
    Runnable task = () -> {
      System.out.println("Never stop learning! " + LocalDateTime.now());
      try { Thread.sleep(1000); } catch (InterruptedException e) { }
    };
    executor.scheduleWithFixedDelay(task, 1, 1,  TimeUnit.SECONDS);
  }

}
