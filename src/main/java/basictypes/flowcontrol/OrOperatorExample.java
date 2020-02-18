package basictypes.flowcontrol;

public class OrOperatorExample {

    public static void main(String[] args) {
        boolean isBartWithCinemaTicket = true;
        boolean isBartWithMoney = false;

        if (isBartWithCinemaTicket || isBartWithMoney) {
            System.out.println("Bart can watch a movie");
        }
    }
}
