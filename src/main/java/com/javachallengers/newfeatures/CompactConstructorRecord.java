package com.javachallengers.newfeatures;

public class CompactConstructorRecord {

  public static void main(String[] args) {
    Car car = new Car("Ferrari", null);
  }
}

record Car(String brand, String model) {

  private static final String test = "";

  Car{
    if (brand == null || model == null) {
      throw new NullPointerException("null values are not accepted.");
    }
  }

}
