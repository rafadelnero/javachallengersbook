package exceptions.challengers;

import java.io.Closeable;
import java.io.IOException;

public class ClosingTheBar {

    static String whoClosedTheBar = "";

    public static void main(String... marvel) {
        Moe moe = new Moe();
        executeAction(moe, new Barney());
        System.out.println(whoClosedTheBar + moe.moeClosedBarCount);
    }

    private static void executeAction(Closeable moe, AutoCloseable barney) {
        try (moe; barney) {
            new Moe().close();
        } catch (Throwable ignore) {
            whoClosedTheBar += "?";
        }
    }

    static class Barney implements AutoCloseable {
        public void close() {
            throw new StackOverflowError();
        }
    }

    static class Moe implements Closeable {
        int moeClosedBarCount = 0;
        public void close() throws IOException {
            moeClosedBarCount++;
            if (moeClosedBarCount == 2) {
                whoClosedTheBar += "moe";
                throw new IOException();
            }
        }
    }

}
