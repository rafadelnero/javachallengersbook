package com.javachallengers.encapsulation.builderpattern;

import com.javachallengers.encapsulation.builderpattern.IronManSimpler.Builder;

public class IronManSimplerExecutor {

  public static void main(String[] args) {
    Builder builder = new IronManSimpler.Builder("Anthony Edward Stark", "48")
        .withCar("Audi R8")
        .withSpecialWeapon("beam weapon");

    builder.withCar("Testing");

//    System.out.printf("%s , %s , %s , %s", ironManSimpler.getName(),
//        ironManSimpler.getAge(), ironManSimpler.getCar(),
//        ironManSimpler.getSpecialWeapon());
  }

}
