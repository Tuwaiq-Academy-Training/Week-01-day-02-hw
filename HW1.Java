//# الواجب الاول 
//Rounding of Grades .. if user grades is 88 or more round it to 90 if the grade is  87 keep it .. if user grade 63 round it to 65 if 62 keep it .. so it’s on factorial of 5 where 3 grades or more round .. 2 or less keep the grade

public class Answer1 {
    public static void main(String[] args) {
        int grade1 = grades(88);
        int grade2 = grades(87);
        int grade3 = grades(63);
        int grade4 = grades(62);



        System.out.println(grade1);
        System.out.println(grade2);
        System.out.println(grade3);
        System.out.println(grade4);

    }

    public static int grades(int grade) {
        int ngrade = grade;
        if ((ngrade + 1) % 5 == 0 || (ngrade + 2) % 5 == 0) {
            if (grade + 1 % 5 == 0) {
                ngrade++;
            } else {
                ngrade += 5;
            }
        }
        return ngrade;
    }
}


//# الواجب الثاني
//Write a program that prints the numbers from 1 to 100 such that:

//1. If the number is a multiple of 3, you need to print "Fizz" instead of that number.
//2. If the number is a multiple of 5, you need to print "Buzz" instead of that number.
//3. If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead of that number.

public class Answer2 {
    public static void main(String[] args)
    {
        int n = 100;
        for (int i=1; i<=n; i++)
        {
            if (i%15==0) {
                System.out.println("FizzBuzz");
                
            }else if (i%5==0) {
                System.out.println("Buzz");
                
            }else if (i%3==0) {
                System.out.println("Fizz");

            } else { 
                System.out.println(i);
            }
        }
    }
}


//# الواجب الثالث
//## **Vowels in the word**
//- pass a name to the function that return the count of vowels in that name
//- print the result

    public class Answer3a {
        public static void main(String args[]) {
        String str = "Faisal Al Sofyani";

        System.out.println(countVowels(str));
    }

    static boolean isVowel(char ch)
    {
        ch = Character.toUpperCase(ch);
        return (ch=='A' || ch=='E' || ch=='I' ||
                ch=='O' || ch=='U');
    }

    static int countVowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (isVowel(str.charAt(i)))
                ++count;
        return count;
    }

}
//##  **Max**
//- Define method called max(). This method takes two parameters num1 and num2 and returns the maximum between the two

public class Answer3b {
    public static void main(String args[]){
        System.out.println(max(10,5));
    }

    public static int max(int num1, int num2) {
        if(num1 > num2) return num1; else return num2;
    }
}
