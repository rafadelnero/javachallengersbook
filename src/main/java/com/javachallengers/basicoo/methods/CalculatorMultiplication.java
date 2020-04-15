package com.javachallengers.basicoo.methods;

class CalculatorMultiplication {
    public static void main(String[] args) {
        CalculatorMultiplication calculator = new CalculatorMultiplication();
        double multiplicationResult = calculator.multiply(2, 2);
        System.out.println(multiplicationResult);
    }

    double multiply(int number1, int number2) {
        return number1 * number2;
    }

}
