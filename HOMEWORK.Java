public class JavaApplication2 {
    public static void main(String[] args) {
       //*** The first Question From HomeWork ***  
       
       
         Scanner input = new Scanner(System.in);
       System.out.println("Please Enter a grade: ");
	 int grade = input.nextInt();
         
        switch (grade) {
            case 88:
            case 89:
                System.out.println("90");
                break;
            case 63:
                System.out.println("65");
                break;
            default:
                System.out.println(grade);
                break;
        }
       
       
      
       //*** The second Question From HomeWork ***     
       
       
       for(int i=1; i<=100; i++){
           if(i%3==0){
               //for multiple of 3 print Fizz
               System.out.println("Fizz ");
           } else if (i%5==0){
               //for multiple of 5 print Buzz
               System.out.println("Buzz ");
           }else if(i%15==0){
               //for multiple of 5 and 3 print FizzBuzz
               System.out.println("FizzBuzz ");
           }
           else{
               //else number
                System.out.print(i);

           }
       }

    // *** Last question Part 1 ***
    
    
         System.out.println(CharcterVowels("Ryan Mohammed Awaji"));
      
    // Last question Part 2
    
    
      System.out.println(maxValue(100,23));
   }
    
    // *** Last question Part 1
    
    
    
    public static int CharcterVowels(String name){
        name = name.toLowerCase();
        int count = 0;

        for (int i = 0; i <name.length() ; i++) {
            if (name.charAt(i)=='a'||name.charAt(i)=='i'||name.charAt(i)=='e'||name.charAt(i)=='u'||name.charAt(i)=='o'){
                count++;}
        }
        return count;
    }
    
    // Last question Part 2
   public static int maxValue(int number0, int number1){
        if (number0 > number1){
            return number0;
        }else
            return number1;
    }
}
