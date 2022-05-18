package com.copmany;

public class Ass4 {

    public static int Max(int num1, int num2){
        int max=0;
        if (num1 > num2){
            max = num1;
        } if ( num2 > num1){
            max = num2;
        }
        return max;
    }
    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 15;
        System.out.println("The Maximum number is " + Max(number1,number2));
    }
}