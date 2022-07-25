package com.javachallengers.concurrency.reentrantlock;

import java.util.Random;
import java.util.concurrent.*;

public class ProducerConsumer {

  public static void main(String[] args) throws InterruptedException {
    BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();

    Runnable producerTask = () -> {
      try {
        int i = new Random().nextInt(100);
        blockingQueue.put(i);
        System.out.println("Produced: " + i);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    };
    Runnable consumerTask = () -> {
      try {
        System.out.println("Consumed : " + blockingQueue.take());
      } catch (InterruptedException ex) {
        ex.printStackTrace();
      }
    };

    ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
    executor.scheduleAtFixedRate(producerTask, 0, 1000, TimeUnit.MILLISECONDS);
    executor.scheduleAtFixedRate(consumerTask, 0, 500, TimeUnit.MILLISECONDS);
  }
}
