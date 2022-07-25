package com.javachallengers.concurrency.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;

public class FixedThreadPoolEx {

  @Test
  public void fixedThreadPoolTest() {
    ExecutorService executor = Executors.newFixedThreadPool(2);

    for (int i =0; i < 1000; i++) {
      Runnable runnableTask = () -> System.out.println(Thread.currentThread().getName());

      executor.submit(runnableTask);
    }
  }

  @Test
  public void fixedThreadPoolWithQueueLimitTest() {
    ExecutorService executor = new ThreadPoolExecutor(100, 100, 0L, TimeUnit.MILLISECONDS,
        new LinkedBlockingQueue<>(100));

    for (int i = 1; i < 1000; i++) {
      Runnable runnableTask = () -> System.out.println(Thread.currentThread().getName());
      executor.submit(runnableTask);
    }
  }

}
