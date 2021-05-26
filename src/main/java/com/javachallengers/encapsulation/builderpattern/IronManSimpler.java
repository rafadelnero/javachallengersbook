package com.javachallengers.encapsulation.builderpattern;

public final class IronManSimpler {

    private String name;
    private String age;
    private String car;
    private String specialWeapon;

    private IronManSimpler() {}

    public static class Builder {

        private IronManSimpler ironManSimpler = new IronManSimpler();

        public Builder(String name, String age) {
            ironManSimpler.name = name;
            ironManSimpler.age = age;
        }

        Builder withSpecialWeapon(String specialWeapon) {
            ironManSimpler.specialWeapon = specialWeapon;
            return this;
        }

        Builder withCar(String car) {
            ironManSimpler.car = car;
            return this;
        }

        public IronManSimpler build() {
            return ironManSimpler;
        }
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
