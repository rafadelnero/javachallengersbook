package exceptions.multicatch;

public class MoeFrisk {

    public static void main(String... multicatch) {
        try {
            String array[] = null;
            System.out.println(array[0].contains("shotgun"));
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | StackOverflowError e) {
            e.printStackTrace();
        }

       /* try {
            String array[] = null;
            System.out.println(array[0].contains("shotgun"));
        } catch (ArrayIndexOutOfBoundsException | Exception | StackOverflowError e) {
            e.printStackTrace();
        }*/
    }

}
