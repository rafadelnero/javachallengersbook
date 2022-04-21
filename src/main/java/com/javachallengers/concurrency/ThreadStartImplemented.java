package com.javachallengers.concurrency;

public class ThreadStartImplemented {

  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName());
    Thread thread = new ThreadRunner();
    thread.start();
  }
}

class ThreadRunner extends Thread {
  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + " is running...");
  }
}
