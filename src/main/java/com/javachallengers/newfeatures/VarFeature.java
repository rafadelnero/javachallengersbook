package com.javachallengers.newfeatures;

import org.junit.jupiter.api.Test;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

public class VarFeature {

//  private var anyVariable = ""; //This won't compile

  @Test
  void varTest() {
    var product = "Playstation 5";

    System.out.println(product.toUpperCase());
    System.out.println(product.getClass());
  }

//  @Test
//  void doSomething(var action) {  } // This won't compile

//@Test
//var doSomething(String action) { return null; } // This won't compile


//  @Test
//  void varWithoutInitialization() {
//    var product;              // Compilation error here
//    System.out.println(product);
//  }

  @Test
  void varTestWithLambda() {
//    var product = () -> "";
    Supplier<String> product = () -> "Playstation 5";
    System.out.println(product.get());
    System.out.println(product.getClass());
  }

  @Test
  void inferArrayOfStrings() {
    var products = new ArrayList<>();
    products.add("Playstation 5");
    products.add("Nintendo Switch");
    System.out.println(products);
  }

  @Test
  void inferArrayOfStringsListOf() {
    var products = List.of("Playstation 5", "Nintendo Switch");
    System.out.println(products);
  }

  @Test
  void inferArrayWithinLambdaProblem() {
//  Function<String, String> products = (@Nonnull product) -> product.toUpperCase(); //It doesn't compile
//    System.out.println(products.apply("Playstation 5"));
  }

  @Test
  void inferArrayWithinLambda() {
    Function<String, String> products = (@Nonnull var product) -> product.toUpperCase();
    System.out.println(products.apply("Playstation 5"));
  }

  @Test
  void inferArrayWithinLambdaInconsistency() {
//    BinaryOperator<String> products = (@Nonnull var product, String price) -> product + " " + price; Compilation Error
//    System.out.println(products.apply("Playstation 5"));
  }

  @Test
  void tryWithResourcesVar() throws IOException {
    var path = Paths.get("customer_purchases.txt");
    try (var lines = Files.lines(path)){ }
  }

  @Test
  void tryToChangeVar() throws IOException {
    var ferrariYearFoundation = 1939;
//    ferrariYearFoundation = "1939";
  }

  @Test
  void var() {
    var var = "Var";
  }

  @Test
  void nullAssign() {
//    var var = null; Compilation error
  }

  @Test
  void anonymousInnerClass() {
    var runnableVar = new Runnable() { public void run() { System.out.println("run!"); } };
    runnableVar.run();
  }

  @Test
  void varArrayAssigning() {
//    var cars[] = new String[] {"Ferrari", "Porsche", "Lamborghini"}; // Compilation error
  }

  @Test
  void genericsAssigning() {
    var  cars = new ArrayList<>(); // Compilation error
  }

}
