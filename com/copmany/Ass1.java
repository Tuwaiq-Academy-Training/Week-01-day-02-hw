package com.copmany;

public class Ass1 {

    public static void main(String[] args) {

        // Assignment 1 for Lecture 1

        int grade = 90;
        int newgrade = grade;

        if (grade % 5 == 0){
            System.out.println(newgrade);
        } else if ((grade+1) % 5 ==0) {
            newgrade = newgrade + 1;
        } else if ((grade+2) % 5 ==0) {
            newgrade = newgrade + 2;
        }
        System.out.println(newgrade);
    }
}
