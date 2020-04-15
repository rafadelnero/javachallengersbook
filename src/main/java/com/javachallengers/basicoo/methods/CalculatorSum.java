package com.javachallengers.basicoo.methods;

class CalculatorSum {
    int sum(int number1, int number2) {
        return number1 + number2;
    }

    public static void main(String[] args) {
        CalculatorSum calculator = new CalculatorSum();
        int sumResult = calculator.sum(2, 2);
        System.out.println(sumResult);
    }
}
