package com.javachallengers.newfeatures;

import java.util.Objects;

public class DataObjectRecord {

  public static void main(String[] args) {
    CarRecord carRecord = new CarRecordBuilder().setBrand("Ferrari").setModel("Portofino").setYear(2022).createCarRecord();
    System.out.println(carRecord.brand());
    System.out.println(carRecord);

    CarWithoutRecord carWithoutRecord = new CarWithoutRecord("Lamborghini", "Aventador", 2022);
    System.out.println(carWithoutRecord.getBrand());
    System.out.println(carWithoutRecord);
  }

}

class CarWithoutRecord {

  private String brand;
  private String model;
  private int year;

  public CarWithoutRecord(String brand, String model, int year) {
    this.brand = brand;
    this.model = model;
    this.year = year;
  }

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public int getYear() {
    return year;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CarWithoutRecord car = (CarWithoutRecord) o;
    return year == car.year && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, model, year);
  }

  @Override
  public String toString() {
    return "CarWithoutRecord[" +
            "brand='" + brand + '\'' +
            ", model='" + model + '\'' +
            ", year=" + year +
            ']';
  }
}

record CarRecord(String brand, String model, int year) {}
