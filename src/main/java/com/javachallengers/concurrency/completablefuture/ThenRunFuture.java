package com.javachallengers.concurrency.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ThenRunFuture {

  static int i = 0;

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    CompletableFuture<Integer> completableFuture
        = CompletableFuture.supplyAsync(() -> i++);

    CompletableFuture<Void> combinedFuture =
        completableFuture.thenRun(() -> System.out.println("Challenger"));

    System.out.println(combinedFuture.get());
    System.out.println(i);
  }

}
