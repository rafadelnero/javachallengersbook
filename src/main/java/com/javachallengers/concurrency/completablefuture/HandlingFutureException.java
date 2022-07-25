package com.javachallengers.concurrency.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import org.junit.jupiter.api.Test;

public class HandlingFutureException {

  @Test
  public void exceptionallyErrorTest() throws ExecutionException, InterruptedException {
    CompletableFuture<String> future
        = CompletableFuture.supplyAsync(() -> 1 / 0 + "Causing ArithmeticException!");
    CompletableFuture<String> errorHandling =
        future.exceptionally(ex -> "There was an error: " + ex.getMessage());

    System.out.println(errorHandling.get());
  }

  @Test
  public void exceptionallySuccessTest() throws ExecutionException, InterruptedException {
    CompletableFuture<String> future
        = CompletableFuture.supplyAsync(() -> "Not causing Exception!");

    CompletableFuture<String> errorHandling =
        future.exceptionally(ex -> "There was an error: " + ex.getMessage());

    System.out.println(errorHandling.get());
  }

}
