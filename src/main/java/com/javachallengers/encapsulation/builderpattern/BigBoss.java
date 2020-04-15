package com.javachallengers.encapsulation.builderpattern;

public class BigBoss {

    private final String stealthCloth;
    private final String primaryWeapon;
    private final String secondaryWeapon;
    private final String meleeWeapon;
    private final String[] medicineItems;

    public static class Builder {

        private String stealthCloth;
        private String primaryWeapon;
        private String secondaryWeapon;
        private String meleeWeapon;
        private String[] medicineItems;

        public Builder(String stealthCloth, String primaryWeapon) {
            this.stealthCloth = stealthCloth;
            this.primaryWeapon = primaryWeapon;
        }

        Builder withExtraWeapons(String secondaryWeapon, String meleeWeapon) {
            this.secondaryWeapon = secondaryWeapon;
            this.meleeWeapon = meleeWeapon;
            return this;
        }

        Builder withMedicineItems(String[] medicineItems) {
            this.medicineItems = medicineItems;
            return this;
        }

        public BigBoss build() {
            return new BigBoss(this);
        }
    }

    private BigBoss(Builder builder) {
        this.stealthCloth = builder.stealthCloth;
        this.primaryWeapon = builder.primaryWeapon;
        this.secondaryWeapon = builder.secondaryWeapon;
        this.meleeWeapon = builder.meleeWeapon;
        this.medicineItems = builder.medicineItems;
    }

    public String getPrimaryWeapon() {
        return primaryWeapon;
    }

    public String getMeleeWeapon() {
        return meleeWeapon;
    }

    public String getSecondaryWeapon() {
        return secondaryWeapon;
    }

    public String[] getMedicineItems() {
        return medicineItems;
    }

    public String getStealthCloth() {
        return stealthCloth;
    }
}
