package chapter3.challengers;

public class NeoJump {

    static String finalResult = "";

    public static void main(String... doYourBest) {
        jump(1, true);
        jump();
        jump(new int[]{1, 2, 3});
        jump(1L);
        jump(1);
        jump(Double.valueOf(1));

        System.out.println(finalResult);
    }

    static void jump(Object o) { finalResult += "1"; }
    static void jump(Object... o) { finalResult += "2";}
    static void jump(Exception... i) { finalResult += "3";}
    static void jump(Long l) { finalResult += "4";}
    static void jump(double d) { finalResult += "5";}

}
