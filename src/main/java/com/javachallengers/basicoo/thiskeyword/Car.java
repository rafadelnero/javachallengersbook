package com.javachallengers.basicoo.thiskeyword;

public class Car {

    String color;

    void changeColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.changeColor("black");
        System.out.println(car.color);
    }
}
