package com.javachallengers.overloading.realworldchallenger;

public class Customer {

    String name;

    public Customer(String customerName) {
        this.name = customerName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
