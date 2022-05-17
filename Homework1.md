# واجبات اليوم الثاني


# الواجب الاول 

Rounding of Grades .. if user grades is 88 or more round it to 90 if the grade is  87 keep it .. if user grade 63 round it to 65 if 62 keep it .. so it’s on factorial of 5 where 3 grades or more round .. 2 or less keep the grade


# الواجب الثاني

Write a program that prints the numbers from 1 to 100 such that:

1. If the number is a multiple of 3, you need to print "Fizz" instead of that number.
2. If the number is a multiple of 5, you need to print "Buzz" instead of that number.
3. If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead of that number.
# الواجب الثالث
## **Vowels in the word**
    - pass a name to the function that return the count of vowels in that name
    - print the result
## **Max**
    - Define method called max(). This method takes two parameters num1 and num2 and returns the maximum between the two

# HW Answers 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("---Qestions 1 :------ ");
       Scanner scr = new Scanner(System.in);
        System.out.println("Enter your grade : ");
        int gr = scr.nextInt();

        switch (gr){
            case 88 :
                System.out.println(90);
                break;
            case 63 :
                System.out.println(65);
        }





        System.out.println("---Qestions 2 :------ ");

        for (int i = 1;  i <= 100; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("FizzBuzz");

            } else if(i % 3 == 0){
                System.out.println("Fizz");

            } else if(i % 5 == 0){
                System.out.println("Buzz");

            } else {
                System.out.println(i);
            }
        }


        System.out.println("---Qestions 3 part one :------ ");

        Scanner scv = new Scanner(System.in);
        System.out.println(" Enter a word : ");
        String str = scv.nextLine();
        vowelsCheck(str);
        System.out.println("the no. of vowels in the word  : " +vowelsCheck(str));

        System.out.println("---Qestions 3 part two :------ ");
        Scanner scm = new Scanner(System.in);
        System.out.println("Enter two nums to get the max : ");
        int num1 = scm.nextInt();
        int num2 =scm.nextInt();
        int res = max(num1 , num2);
        System.out.println(" the maximum is : " + res);


}

      // Question 3 part one :
      public static int vowelsCheck(String vLetter){
        int count = 0 ;
          for (int i = 0; i <vLetter.length(); i++) {
              // comparing the vowels (a,e,i,o,u) using if stmt
              if(vLetter.charAt(i) == 'a' || vLetter.charAt(i) == 'e' ||
              vLetter.charAt(i) == 'i' || vLetter.charAt(i) =='o' || vLetter.charAt(i) == 'u' ){

                  count++;
              }

              
          }

          return count;
      }

    // Question 3 part two :
    public static int max(int num1 , int num2){
        if(num1 > num2){
            System.out.println("the max is : " + num1);
        } else if (num2 > num1) {
            System.out.println("the max is : " + num2);

        } else {
            System.out.println("there probably equal :)");

        }

            return max(num1,num2);
    }


    }
