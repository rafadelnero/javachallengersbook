package com.javachallengers.encapsulation.builderpattern;

public class IronMan {

    private final String name;
    private final String age;
    private final String car;
    private final String specialWeapon;

    public static class Builder {

        private final String name;
        private final String age;
        private String specialWeapon;
        private String car;

        public Builder(String name, String age) {
            this.name = name;
            this.age = age;
        }

        Builder withSpecialWeapon(String specialWeapon) {
            this.specialWeapon = specialWeapon;
            return this;
        }

        Builder withCar(String car) {
            this.car = car;
            return this;
        }

        public IronMan build() {
            return new IronMan(this);
        }
    }

    private IronMan(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.specialWeapon = builder.specialWeapon;
        this.car = builder.car;
    }

    String getName() {
        return name;
    }

    String getAge() {
        return age;
    }

    String getCar() {
        return car;
    }

    String getSpecialWeapon() {
        return specialWeapon;
    }

}
