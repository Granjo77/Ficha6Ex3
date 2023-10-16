package org.example;

public class Number {

    public static int numberOfDigits(int number){
        int sumOfNumbers = 0;
        int numOfNumbers = String.valueOf(number).length();
        while (number > 0){
            sumOfNumbers += (number % 10);
            number = number / 10;
        }

        int average = sumOfNumbers/numOfNumbers;
        return average;
    }

}
