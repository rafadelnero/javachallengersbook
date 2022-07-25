package com.javachallengers.concurrency.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class SupplyAsyncExample {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    CompletableFuture<String> completableFuture
        = CompletableFuture.supplyAsync(() -> "Challenger supply!");

    System.out.println(completableFuture.get());
  }

}
