package com.javachallengers.concurrency.waitnotify;

public class NoMonitorNotifyExample {

  public static void main(String[] args) {
    new NoMonitorNotifyExample().tryToUseNotify();
  }

  void tryToUseNotify() {
    notify();
  }
}
