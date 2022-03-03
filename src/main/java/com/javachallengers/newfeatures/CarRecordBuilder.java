package com.javachallengers.newfeatures;

public class CarRecordBuilder {
  private String brand;
  private String model;
  private int year;

  public CarRecordBuilder setBrand(String brand) {
    this.brand = brand;
    return this;
  }

  public CarRecordBuilder setModel(String model) {
    this.model = model;
    return this;
  }

  public CarRecordBuilder setYear(int year) {
    this.year = year;
    return this;
  }

  public CarRecord createCarRecord() {
    return new CarRecord(brand, model, year);
  }
}