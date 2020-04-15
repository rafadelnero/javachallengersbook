package com.javachallengers.basicoo.challengers;

public class ResidentEvilNameChange {

    String name = "Nemesis";

    ResidentEvilNameChange(String name) {
        name = name;
    }

    public static void main(String[] doYourBest) {
        ResidentEvilNameChange residentEvilNameChange = new ResidentEvilNameChange("Leon");
        System.out.println(residentEvilNameChange.name);

        residentEvilNameChange.changeName("Claire");
        System.out.println(residentEvilNameChange.name);
    }

    void changeName(String name) {
        this.name = this.name;
    }
}
