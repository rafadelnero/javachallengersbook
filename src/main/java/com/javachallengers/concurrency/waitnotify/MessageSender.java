package com.javachallengers.concurrency.waitnotify;

class MessageSender {
  private boolean messageSent = false;
  private String message;

  public synchronized void receiveMessage() {
    while(!messageSent){
      try {
        wait();
      } catch (InterruptedException e) { e.printStackTrace(); }
    }
    System.out.println(message);
  }

  public synchronized void sendMessage() {
    message = "Hello!";
    this.messageSent = true;
    notify();
  }

  public static void main(String[] args) {
    MessageSender messageSender = new MessageSender();
    new Thread(messageSender::receiveMessage).start();
    new Thread(messageSender::sendMessage).start();
  }
}
