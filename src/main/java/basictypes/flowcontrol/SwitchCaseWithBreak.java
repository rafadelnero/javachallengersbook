package basictypes.flowcontrol;

public class SwitchCaseWithBreak {

    public static void main(String[] args) {
        String barneyBeerPreference = "Duff";

        switch (barneyBeerPreference) {
            case "Duff": {
                System.out.println("Barney prefers Duff");
                break;
            }
            default: System.out.println("Some other beer");
        }

    }
}
