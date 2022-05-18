package com.copmany;

public class Ass2 {

    public static void main(String[] args) {

        // Assignment 2 for Lecture 1

        for( int i = 1; i <= 100; i++){
            if ( i % 3 == 0){
                System.out.println("The number is " + i + " Fizz");
            }
            if ( i % 5 == 0){
                System.out.println("The number is " + i + " Buzz");
            }
            if ( i % 3 == 0 && i % 5 == 0){
                System.out.println("The number is " + i + " FizzBuzz");
            }
        }

    }
}