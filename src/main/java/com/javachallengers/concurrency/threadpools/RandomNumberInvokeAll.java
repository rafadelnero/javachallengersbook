package com.javachallengers.concurrency.threadpools;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RandomNumberInvokeAll {

  public static void main(String... invokeAll) throws InterruptedException {
    ExecutorService executor = Executors.newFixedThreadPool(2);
    Callable<String> delayedRandomNumberTask = () -> {
      Thread.sleep(1000);
      return "Delayed: " + new Random().nextInt(1000);
    };
    Callable<String> nonDelayedRandomNumberTask = () -> "Non-delayed: "
                                                        + new Random().nextInt(1000);

    List<Callable<String>> taskList = List.of(delayedRandomNumberTask, nonDelayedRandomNumberTask);
    List<Future<String>> resultList = executor.invokeAll(taskList);

    executor.shutdown();

    resultList.forEach(e -> {
      try {
        System.out.println(e.get());
      } catch (InterruptedException | ExecutionException ex) {
        ex.printStackTrace();
      }
    });
  }
}
