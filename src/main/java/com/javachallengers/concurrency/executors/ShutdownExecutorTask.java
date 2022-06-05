package com.javachallengers.concurrency.executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ShutdownExecutorTask {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService executor = Executors.newFixedThreadPool(1);
    Runnable callableTask = () -> System.out.println(Thread.currentThread().getName());

    executor.submit(callableTask);
    executor.submit(callableTask);

    if (!executor.awaitTermination(500, TimeUnit.MILLISECONDS)) {
      executor.shutdown();
    }
  }
}
