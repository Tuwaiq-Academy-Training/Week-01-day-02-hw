import java.util.Locale;
import java.util.Scanner;

public class HW1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //الواجب الاول
        //Rounding of Grades .. if user grades is 88 or more round it to 90 if the grade is 87 keep it ..
        // if user grade 63 round it to 65 if 62 keep it .. so it’s on factorial of 5 where 3 grades or more round .. 2 or less keep the grade
        System.out.println("Enter a grade to round");
        int grade = input.nextInt();

        int gradeMode = grade % 10;

        if (gradeMode==9 || gradeMode==4){
            grade +=1;

        }else if (gradeMode==8 || gradeMode==3){
            grade +=2;
        }
        System.out.println("The rounded grade is: " + grade + "!");

        System.out.println("!-----------------------------------------!");

        //الواجب الثاني
        //Write a program that prints the numbers from 1 to 100 such that:
        //If the number is a multiple of 3, you need to print "Fizz" instead of that number.
        //If the number is a multiple of 5, you need to print "Buzz" instead of that number.
        //If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead of that number.

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            }else {
                System.out.println(i);
            }
        }

        System.out.println("!-----------------------------------------!");

        //الواجب الثالث
        //Vowels in the word
        //- pass a name to the function that return the count of vowels in that name
        //- print the result

        System.out.println(numVowels("abdullah"));

        System.out.println("!-----------------------------------------!");
        //Max
        //- Define method called max(). This method takes two parameters num1 and num2 and returns the maximum between the two

        System.out.println(maxTwo(3,5));
        System.out.println("!-----------------------------------------!");
    }

    public static int numVowels(String name){
        int count = 0;
        //A, E, I, O, U

        name = name.toLowerCase(Locale.ROOT);
        for (int i = 0; i <name.length() ; i++) {
            if (name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }

    public static int maxTwo(int num1, int num2){
        if (num1 > num2){
            return num1;
        }else
            return num2;
    }
}
