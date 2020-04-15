package com.javachallengers.basicoo.constructors;

public class Car {

    String brand;
    String color;

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public static void main(String[] args) {
        Car porsche = new Car("Porsche", "black");
        System.out.println(porsche.brand);
        System.out.println(porsche.color);
    }

}

