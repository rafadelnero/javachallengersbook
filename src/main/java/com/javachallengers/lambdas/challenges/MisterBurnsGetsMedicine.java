package com.javachallengers.lambdas.challenges;

public class MisterBurnsGetsMedicine {
    public static void main(String... doYourBest) {
        MedicineSupplier medicine = Smithers::new;
        short shortMedicine = 3;
        medicine.provideMedicine(1);
        medicine.provideMedicine(shortMedicine);
        medicine.provideMedicine(Integer.valueOf(1));
    }
    static class Smithers {
        Smithers(int any) {
            System.out.printf("Smithers gives:%s to Mister Burns with int \n", any);
        }
        Smithers(short any) {
            System.out.printf("Smithers gives:%s to Mister Burns with short   \n", any);
        }
        Smithers(Integer any) {
            System.out.printf("Smithers gives:%s to Mister Burns with Integer \n", any);
        }
    }
    @FunctionalInterface
    private interface MedicineSupplier {
        Smithers provideMedicine(int quantity);
        boolean equals(Object obj);                                 // #1
    }
}
