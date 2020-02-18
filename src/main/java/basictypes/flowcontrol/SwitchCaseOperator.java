package basictypes.flowcontrol;

public class SwitchCaseOperator {

    public static void main(String[] args) {
        String barneyBeerPreference = "Duff";

        switch (barneyBeerPreference) {
            case "Guinness": System.out.println("Barney prefers Guinness");
            case "Heineken": System.out.println("Barney prefers Heineken");
            case "Duff": System.out.println("Barney prefers Duff");
            default: System.out.println("Some other beer");
        }

    }
}
