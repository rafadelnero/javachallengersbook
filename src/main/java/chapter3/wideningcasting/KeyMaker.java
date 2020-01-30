package chapter3.wideningcasting;

public class KeyMaker {

    public static void main(String... wideningAndCastingPrimitives) {
        char keyChar = 1;
        double keyDouble = keyChar;
        short keyShort = 1;
        float keyFloat = keyShort;

        int keyInt = (int) keyDouble;
        byte keyByte = (byte) keyDouble;
        long keyLong = keyInt;
    }

}
