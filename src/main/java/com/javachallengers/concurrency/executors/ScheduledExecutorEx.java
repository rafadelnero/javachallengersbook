package com.javachallengers.concurrency.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorEx {

  public static void main(String[] args) {
    ScheduledExecutorService executor = Executors
        .newSingleThreadScheduledExecutor();

    Runnable task = () -> System.out.println(Thread.currentThread().getName());

    executor.schedule(task, 100, TimeUnit.MILLISECONDS);
    executor.schedule(task, 100, TimeUnit.MILLISECONDS);

    executor.shutdown();
  }

}
