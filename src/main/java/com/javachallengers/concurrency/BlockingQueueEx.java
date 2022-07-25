package com.javachallengers.concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class BlockingQueueEx {

  public static void main(String[] args) throws InterruptedException {
    BlockingQueue<String> blockingQueue = new LinkedBlockingQueue<>(2);

    Runnable producer = () -> {
      try {
        blockingQueue.put("Java Challenger");
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    };

    Runnable consumer = () -> {
      try {
        System.out.println(blockingQueue.take());
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    };

    ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

    executor.scheduleAtFixedRate(producer, 0, 100, TimeUnit.MILLISECONDS);
    executor.scheduleAtFixedRate(consumer, 0, 100, TimeUnit.MILLISECONDS);
  }

}
