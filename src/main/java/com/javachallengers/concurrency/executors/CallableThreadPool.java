package com.javachallengers.concurrency.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableThreadPool {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService executor = Executors.newFixedThreadPool(1);
    Callable<String> callableTask = () -> Thread.currentThread().getName();

    Future<String> future1 = executor.submit(callableTask);
    Future<String> future2 = executor.submit(callableTask);

    System.out.println(future1.isDone());
    System.out.println(future1.get());
    System.out.println(future1.isDone());

    System.out.println(future2.get());
  }
}
