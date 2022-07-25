package com.javachallengers.concurrency.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;

public class CachedThreadPoolEx {

  @Test
  public void cachedThreadPoolTest() {
    ExecutorService executor = Executors.newCachedThreadPool();

    for (int i =0; i < 100000000; i++) {
      Runnable runnableTask = () -> System.out.println(Thread.currentThread().getName());
      executor.submit(runnableTask);
    }
  }

}
