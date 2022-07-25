package com.javachallengers.concurrency.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ThenApplyFuture {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    CompletableFuture<String> completableFuture
        = CompletableFuture.supplyAsync(() -> "Java");

    CompletableFuture<String> combinedFuture =
        completableFuture.thenApply(previousResult -> previousResult + " Challenger");

    System.out.println(combinedFuture.get());
  }

}
