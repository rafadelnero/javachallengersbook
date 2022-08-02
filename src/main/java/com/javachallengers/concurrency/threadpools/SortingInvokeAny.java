package com.javachallengers.concurrency.threadpools;

import com.javachallengers.collections.comparable.ComparingString;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SortingInvokeAny {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    List<String> heroes = new ArrayList<>(List.of("Spider-Man", "Batman", "Iron Man"));

    Callable<List<String>> naturalSort = () -> {
      System.out.println("Natural Sort");
      Thread.sleep(new Random().nextInt(500));
      heroes.sort(String::compareTo);
      return heroes;
    };

    Callable<List<String>>  revertSort = () -> {
      System.out.println("Revert Sort");
      Thread.sleep(new Random().nextInt(500));
      heroes.sort(Comparator.reverseOrder());
      return heroes;
    };

    List<Callable<List<String>>> taskList = List.of(naturalSort, revertSort);
    ExecutorService executor = Executors.newCachedThreadPool();

    try {
      List<String> sortedArray = executor.invokeAny(taskList);
      System.out.println(sortedArray);
      executor.shutdown();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }
  }

}
