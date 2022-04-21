package com.javachallengers.concurrency;

public class ThreadRunnableStart {

  public static void main(String[] args) {
    runnableWithAnonymousInnerClass();
  }

  private static void runnableWithAnonymousInnerClass() {
    Runnable runnable = new Runnable() {
      public void run() {
        System.out.println("Running a Runnable!");
      }
    };

    Thread thread = new Thread(runnable);
    thread.start();
  }

  private static void runnableWithLambda() {
    Runnable runnable = () -> System.out.println("Running a Runnable!");

    Thread thread = new Thread(runnable);
    thread.start();
  }
}
