# واجبات اليوم الثاني


# الواجب الاول 

Rounding of Grades .. if user grades is 88 or more round it to 90 if the grade is  87 keep it .. if user grade 63 round it to 65 if 62 keep it .. so it’s on factorial of 5 where 3 grades or more round .. 2 or less keep the grade
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("How many students?");
int n = in.nextInt();
for(int i = 0; i < n; i++){
System.out.println("Enter grads:");
int grade = in.nextInt();
int x = grade%5;
if(x >= 3){
System.out.println(grade+2);
}
else{
System.out.println(grade);
}
}
}
}


# الواجب الثاني

Write a program that prints the numbers from 1 to 100 such that:

1. If the number is a multiple of 3, you need to print "Fizz" instead of that number.
2. If the number is a multiple of 5, you need to print "Buzz" instead of that number.
3. If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead of that number.
   public class Q2 {
   public static void main(String[] args) {
   for(int i = 0;i<=100;i++){
   if (i%3==0 && i%5==0)
   {System.out.println("FizzBuzz");
   }else if(i%3==0){
   System.out.println("Fizz");
   }else if(i%5==0){
   System.out.println("Buzz");
   }

   }}}



# الواجب الثالث
## **Vowels in the word**
    - pass a name to the function that return the count of vowels in that name
    - print the result
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner name=new Scanner(System.in);
System.out.print("Enter a string: ");
String s= name.nextLine();
System.out.println("Number of vowels: "+countVowels(s));
}
public static int countVowels(String word){
int vowelCount=0;
for (int i=0;i<word.length();i++){
if(word.charAt(i)=='A'||word.charAt(i)=='a'||word.charAt(i)=='E'||word.charAt(i)=='e'||word.charAt(i)=='I'
||word.charAt(i)=='i'||word.charAt(i)=='O'||word.charAt(i)=='o'||word.charAt(i)=='U'||word.charAt(i)=='u'){
vowelCount++;
}
}
return  vowelCount;
}
}

## **Max**
    - Define method called max(). This method takes two parameters num1 and num2 and returns the maximum between the two
import java.util.Scanner;

import static java.lang.Math.max;

public class Q4 {
public static void main(String[] args) {
Scanner num=new Scanner(System.in);
System.out.print("Enter two number: ");
int n= num.nextInt();
int n1=num.nextInt();
System.out.println("the max number is: "+maxnum(n,n1));
}
public static int maxnum(int num1,int num2){

           int n= max(num1,num2);

            return n;
        }
    }


