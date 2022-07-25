package com.javachallengers.concurrency.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import org.junit.jupiter.api.Test;

public class SupplyAsyncCompose {

  @Test
  public void thenApplyTest() throws ExecutionException, InterruptedException {
    CompletableFuture<String> completableFuture
        = CompletableFuture.supplyAsync(() -> "Java");

    CompletableFuture<String> combinedFuture =
        completableFuture.thenApply(previousResult -> previousResult + " Challenger");

    System.out.println(combinedFuture.get());
  }

  @Test
  public void thenComposeWithMethodReferenceTest() throws ExecutionException, InterruptedException {
    CompletableFuture<String> completableFuture
        = CompletableFuture.supplyAsync(() -> "Java");

    CompletableFuture<String> combinedFuture =
        completableFuture.thenCompose(SupplyAsyncCompose::composeFutures);

    System.out.println(combinedFuture.get());
  }

  @Test
  public void thenComposeTest() throws ExecutionException, InterruptedException {
    CompletableFuture<String> completableFuture
        = CompletableFuture.supplyAsync(() -> "Java");

    CompletableFuture<String> combinedFuture =
        completableFuture.thenCompose((supplyString) -> {
          System.out.println(supplyString + " Composing...");

          return CompletableFuture.supplyAsync(() -> "Challenger");
        });

    System.out.println(combinedFuture.get());
  }

  private static CompletableFuture<String> composeFutures(String supplyString)  {
    System.out.println(supplyString + " Composing...");

    return CompletableFuture.supplyAsync(() -> "Challenger");
  }

}
