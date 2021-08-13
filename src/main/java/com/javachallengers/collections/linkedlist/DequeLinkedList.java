package com.javachallengers.collections.linkedlist;

import java.util.Deque;
import java.util.LinkedList;

public class DequeLinkedList {
  // The Last-in will be the first-out
  public static void main(String[] args) {
    Deque<String> deque = new LinkedList<>();
    deque.push("Wolverine");
    deque.push("Storm");
    deque.push("Xavier");
    deque.push("Juggernaut");  // Last-in
    deque.pop();               // First-out
    System.out.println(deque);
  }
}
