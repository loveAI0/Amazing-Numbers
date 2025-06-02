import java.util.Scanner;
class Main{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        //Welcome 

        System.out.println("""
                Welcome to Amazing Numbers!

                Supported requests:
                - enter a natural number to know its properties;
                - enter 0 to exit.""");
        long flag = 1;
        while(flag != 0){
            //input
            System.out.print("Enter a request: ");
            String numStr = input.next();
            long num = Long.parseLong(numStr);

            if(num == 0){
                input.close();
                System.out.println("\n\nGoodBye!");
                break;
            } 
            
            
            boolean result = EvenOdd.isNatural(num);


            if (result){
                boolean isEven = EvenOdd.isEvenOdd(num);
                boolean isBuzz = BuzzNumber.isBuzz(num);
                boolean isDuck = DuckNumber.isDuck(num);
                boolean isPalindrom = PalindromicNumber.isPalindrom(num);
                String output = String.format("""
                    Properties of %,d
                    even: %b
                     odd: %b
                    buzz: %b
                    duck: %b
             palindromic: %b
                        """, num, isEven, !isEven, isBuzz, isDuck, isPalindrom);
                System.out.println(output);
            }
            else{
                System.out.println("The first parameter should be a natural number or zero.");
                
            } 
                    
        }       
        
        

        
    }
}