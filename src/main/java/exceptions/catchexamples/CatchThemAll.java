package exceptions.catchexamples;

import java.io.IOException;

public class CatchThemAll {

    public static void main(String... catchThemAll) {
        try {
            throw new NullPointerException();
        } catch (RuntimeException runtimeException) {
            runtimeException.printStackTrace();
        }

        try {
            throw new IOException();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        try {
            throw new StackOverflowError();
        } catch (Error error) {
            error.printStackTrace();
        }
    }

}
