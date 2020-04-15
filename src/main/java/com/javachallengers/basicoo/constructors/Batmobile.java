package com.javachallengers.basicoo.constructors;

public class Batmobile {

    String versionName;
    int modelYear;

    Batmobile(String versionName, int modelYear) {
        this.versionName = versionName;
        this.modelYear = modelYear;
    }

    Batmobile() {
        this("Batman Forever", 1995);
    }

    public static void main(String[] batMobileRocks) {
        Batmobile batmanForever = new Batmobile();
        batmanForever.printBatMobileDescription();

        Batmobile batmanArkhamKnight = new Batmobile("Arkham Knight", 2014);
        batmanArkhamKnight.printBatMobileDescription();
    }

    void printBatMobileDescription() {
        System.out.println("Version name:" + this.versionName + " Model year:" + this.modelYear);
    }
}
