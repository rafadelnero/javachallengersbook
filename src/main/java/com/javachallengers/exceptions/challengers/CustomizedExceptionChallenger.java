package com.javachallengers.exceptions.challengers;

public class CustomizedExceptionChallenger {
    public static void main(String... doYourBest) {
        try (NoBeerException exception = new NoBeerException()) {
            System.out.println("getBeer");
            throw new Error();
        } catch (Exception exception) {
            System.out.println("getWhiskey");
        } catch (Error error) {
            System.out.println(error.getSuppressed()[0]);
            System.out.println("getWine");
        } finally {
            try {
                int i = 1 / 0;
            } catch (RuntimeException exception) {
                System.out.println("NoBeers");
            }
        }
    }

    static class NoBeerException extends Exception implements AutoCloseable {
        public void close() {
            System.out.println("Closing...");
            throw new RuntimeException(); }
    }
    static class NoBarException extends RuntimeException {}
    static class NoAlcoholError extends Error {}
}
