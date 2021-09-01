package com.javachallengers.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueLinkedList {

  public static void main(String[] args) {
    Queue<String> heroesQueue = new ArrayDeque<>();
    heroesQueue.offer("Wolverine");  // First-in
    heroesQueue.add("Storm");
    heroesQueue.offer("Xavier");
    System.out.println(heroesQueue);
    heroesQueue.remove();            // First-out
    heroesQueue.poll();
    System.out.println(heroesQueue);
  }
}
