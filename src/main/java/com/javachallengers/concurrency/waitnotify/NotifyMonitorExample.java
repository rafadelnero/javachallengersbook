package com.javachallengers.concurrency.waitnotify;

public class NotifyMonitorExample {

  public static void main(String[] args) {
    new NotifyMonitorExample().tryToUseNotify();
  }

  synchronized void tryToUseNotify() {
    notify();
    System.out.println("Runs fine when there is lock...");
  }
}
