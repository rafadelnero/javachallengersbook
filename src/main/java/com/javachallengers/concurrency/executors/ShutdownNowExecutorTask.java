package com.javachallengers.concurrency.executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ShutdownNowExecutorTask {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService executor = Executors.newFixedThreadPool(1);
    Runnable callableTask = () -> System.out.println(Thread.currentThread().getName());

    executor.submit(callableTask);
    executor.submit(callableTask);

    executor.shutdown();
      try {
        if (!executor.awaitTermination(50, TimeUnit.SECONDS)) {
          executor.shutdownNow();
          if (!executor.awaitTermination(50, TimeUnit.SECONDS))
            System.err.println("Thread pool is not terminated");
        }
      } catch (InterruptedException ie) {
        executor.shutdownNow();
      }
  }
}
