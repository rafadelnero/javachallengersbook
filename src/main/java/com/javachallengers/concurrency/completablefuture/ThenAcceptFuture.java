package com.javachallengers.concurrency.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ThenAcceptFuture {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    CompletableFuture<String> completableFuture
        = CompletableFuture.supplyAsync(() -> "Java");

    CompletableFuture<Void> combinedFuture =
        completableFuture.thenAccept(previousResult
            -> System.out.println(previousResult + " Challenger"));

    System.out.println(combinedFuture.get());
  }

}
