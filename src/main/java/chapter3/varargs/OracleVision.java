package chapter3.varargs;

public class OracleVision {

    static String bits = "";

    public static void main(String... varArgsOverloading) {
        visionOf(1, 1);
        visionOf(1.0, 1, 1);
        visionOf();

        System.out.println(bits);
    }

    static void visionOf(Integer neo, Integer morpheus) { bits += "A"; }
    static void visionOf(double trinity, int... agentSmith) { bits += "B"; }
    static void visionOf(int... keyMaker) { bits += "C"; }
}
