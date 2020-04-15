package com.javachallengers.encapsulation.builderpattern;

public class BuilderExecutor {

    public static void main(String[] args) {
        BigBoss bigBoss = new BigBoss.Builder("Military uniform", "Mk22")
                .withExtraWeapons("AK-47", "CQC knife")
                .withMedicineItems(new String[] {"First Aid Kit"})
                .build();

        System.out.printf("%s , %s , %s , %s , %s", bigBoss.getStealthCloth(),
                bigBoss.getPrimaryWeapon(), bigBoss.getSecondaryWeapon(),
                bigBoss.getMeleeWeapon(), bigBoss.getMedicineItems()[0]);
    }

}
