package com.javachallengers.concurrency.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewFixedThreadPool {

  public static void main(String[] args) {
    ExecutorService executor = Executors.newFixedThreadPool(2);

    Runnable runnableTask = () -> System.out.println(Thread.currentThread().getName());

    executor.submit(runnableTask);
    executor.submit(runnableTask);
    executor.submit(runnableTask);
  }
}
