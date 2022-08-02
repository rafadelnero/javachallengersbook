package com.javachallengers.concurrency.reentrantlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.stream.IntStream;

public class ReadWriteLockEx {

  private static ReadWriteLock lock = new ReentrantReadWriteLock();
  private static int counter = 0;

  public static void main(String[] args) {
    ExecutorService executor = Executors.newFixedThreadPool(5);
    Runnable writeTask = () -> {
      lock.writeLock().lock();
      System.out.println("Start writing: " + counter);
      counter++;
      System.out.println("Finish writing: " + counter);
      lock.writeLock().unlock();
    };
    Runnable readTask = () -> {
      lock.readLock().lock();
      String threadName = Thread.currentThread().getName();
      System.out.println(threadName + " Start reading: " + counter);
      System.out.println(threadName + " Finish reading: " + counter);
      lock.readLock().unlock();
    };

    IntStream.rangeClosed(1, 4).forEach(e -> {
      executor.execute(writeTask);
      executor.execute(readTask);
    });

    executor.shutdown();
  }
}
