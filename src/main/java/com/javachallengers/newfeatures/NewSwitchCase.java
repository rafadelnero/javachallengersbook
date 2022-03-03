package com.javachallengers.newfeatures;

import org.junit.jupiter.api.Test;

public class NewSwitchCase {

    @Test
    void oldSwitchCase() {
        int formulaNumber = 7;
        String heisenbergElement = "";

        switch (formulaNumber) {
            case 5:
                heisenbergElement += "H";
                break;
            case 7:
                heisenbergElement += "N";
                break;
            default:
                heisenbergElement += "He";
        }

        System.out.println(heisenbergElement);
    }

    @Test
    void newSwitchCase() {
        int formulaNumber = 7;
        String heisenbergElement = "";

        switch (formulaNumber) {
            case 5 -> heisenbergElement += "H";
            case 7 -> heisenbergElement += "N";
            default -> heisenbergElement += "He";
        }

        System.out.println(heisenbergElement);
    }

    @Test
    void newSwitchCaseYield() {
        int elementNumber = 92;
        String heisenbergElement = "";

        var chemicalElement = switch (elementNumber) {
            case 7 -> {
                heisenbergElement += "N";
                yield heisenbergElement;
            }
            case 5 ->  {
                heisenbergElement += "H";
                yield heisenbergElement;
            }
            default ->  {
                heisenbergElement = "He";
                yield heisenbergElement;
            }
        };

        System.out.println(chemicalElement);
    }


    String test() {
        int formulaNumber = 5;
        String heisenbergFormula = "";
        return switch (formulaNumber) {
            case 30 -> heisenbergFormula += "Zn";
            case 5 ->  {
                heisenbergFormula += "H";
                System.out.println("fdafas");
                yield  "";
            }
            default -> heisenbergFormula += "He";
        };
    }
}
