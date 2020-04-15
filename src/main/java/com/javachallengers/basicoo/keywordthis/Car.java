package com.javachallengers.basicoo.keywordthis;

class Car {

    String brand;
    String color; // Instance variable

    void setupCar() { // This parameter is a local variable
        brand = "Lamborghini"; // The JVM will include the this keyword automatically if we don’t 
        this.color = "black"; // By using this we are accessing an instance variable
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setupCar();
        System.out.println(car.brand); // Lamborghini will be printed
        System.out.println(car.color); // black will be printed
    }

}
