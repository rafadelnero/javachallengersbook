package com.javachallengers.basicoo.methods;

class TextHandler {
    String concatenate(String firstText, String secondText) {
        return firstText + secondText;
    }

    public static void main(String []args) {
        TextHandler textHandler = new TextHandler();
        String concatenatedText = textHandler.concatenate("Java", "Challengers");
        System.out.println(concatenatedText);
    }
}
