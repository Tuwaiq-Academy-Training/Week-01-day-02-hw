package com.copmany;

public class Ass3 {

    public static boolean isVowel(char c1) {
        c1 = Character.toUpperCase(c1);
        return (c1 == 'A' || c1 == 'E' || c1 == 'U' || c1 == 'O' || c1 == 'I');
    }

    public static int countVowels(String s1) {
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (isVowel(s1.charAt(i))) {
                ++count;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String name = "haneen alrewaished";
        System.out.println("The number of vowels is : " +countVowels(name));

    }
}

