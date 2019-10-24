package chapter4.challengers;

public class TheTrickyObjectClass {

  public static void main(String... doYourBest) {
    System.out.print(new NoBeerException() instanceof Object ? "1" : "0");
    System.out.print(new Barney() instanceof Object ? "1" : "0");
    System.out.print(Barney.class instanceof Object ? "1" : "0");
    System.out.print(Class.class instanceof Object ? "1" : "0");
  }

}

class NoBeerException extends Exception { }
class Barney extends Object {}
