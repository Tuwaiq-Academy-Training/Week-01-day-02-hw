	//
	//// +++++++++++++++++++++++++++++++++++
	////      H W 1
	//// Rounding of Grades .. if user grades is 88 or more round it to 90 if the grade is 87 keep it .. if user grade 63 round it to 65 if 62 keep it .. so it’s on factorial of 5 where 3 grades or more round .. 2 or less keep the grade
	//// +++++++++++++++++++++++++++++++++++
	//import java.util.*;
	//public class Main {
	//    public static void main(String[] args) {
	//
	//
	//        Scanner input = new Scanner(System.in);
	//        System.out.println("Enter a grade: ");
	//        int grade = input.nextInt();
	//
	//        int round = grade % 10;
	//        if (round == 9 || round == 4){
	//            grade = grade + 1;
	//        }
	//        else if (round==8 || round==3){
	//            grade = grade2;
	//        }
	//        System.out.println("Grade after rounding: " + grade);
	//    }
	//}




	//// +++++++++++++++++++++++++++++++++++
	////      H W 2
	//// Write a program that prints the numbers from 1 to 100 such that:
	// 1-If the number is a multiple of 3, you need to print "Fizz" instead of that number.
	// 2-If the number is a multiple of 5, you need to print "Buzz" instead of that number.
	// 3-If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead of that number.
	//// +++++++++++++++++++++++++++++++++++
	public class Main {
	//    public static void main(String[] args) {
	//
	//        for (int i = 1; i <= 90; i++) {
	//            if (i % 3 == 0 && i % 5 == 0){
	//                System.out.println("FizzBuzz");
	//            }
	//            else if (i % 5 == 0) {
	//                System.out.println("Buzz");
	//            }
	//            else if (i % 3 == 0) {
	//                System.out.println("Fizz");
	//            }
	//            else {
	//                System.out.println(i);
	//            }
	//        }
	//    }
	//}





	//// +++++++++++++++++++++++++++++++++++
	////      H W 3  -  Vowels
	//// - pass a name to the function that return the count of vowels in that name
	//// - print the result
	//// +++++++++++++++++++++++++++++++++++
	//import java.util.Locale;
	//public class Main {
	//    public static void main(String[] args) {
	//
	//        System.out.println(numberOfName("Faisal"));
	//    }
	//
	//    public static int numberOfName(String name) {
	//        int count = 0;
	//
	//        name = name.toLowerCase(Locale.ROOT);
	//        for (int i = 0; i < name.length(); i++) {
	//            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') {
	//                count++;
	//            }
	//        }
	//        return count;
	//    }
	//
	//}





	//// +++++++++++++++++++++++++++++++++++
	////      H W 3 - MAx
	//// - Define method called max(). This method takes two parameters num1 and num2 and returns the maximum between the two
	//// +++++++++++++++++++++++++++++++++++
	//public class Main {
	//    public static void main(String[] args) {
	//        System.out.println(MAXnumber(1,4));
	//
	//    }
	//    public static int MAXnumber(int num1, int num2){
	//        if (num1 < num2){
	//            return num2;
	//        }else
	//            return num1;
	//    }
	//}
