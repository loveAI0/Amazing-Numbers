/* 
import java.util.Scanner;
public class Step1 {

     public static boolean parity(long num){
     long lastDigit = 0;
        while(num > 0){
            lastDigit = num % 10;
            num /= 10;
            num -= 2 * lastDigit;
           
            if(num == 0 || num % 7 == 0){
                return true;
            }
        }
        return false;
          
     }
     public static void main(String[] args){
          Scanner input = new Scanner(System.in);
         
         
               System.out.println("Enter a natural number:");
               long num = input.nextLong();
               input.close();
               System.out.println(num < 0 ? "This number is not natural!" :
                                             num % 2 == 0 ? "This number is Even." : "This number is Odd.");
               boolean rem = num % 10 == 7;
               boolean parity = parity(num);
             
         
               if(!parity && !rem){
                    System.out.println(String.format("It is not a Buzz number.\nExplanation:\n %d is neither divisible by 7 nor does it end with 7", num));
               }
               else if(parity && rem ){
                    
                    System.out.println(String.format("It is a Buzz number.\nExplanation:\n %d is divisible by 7 and ends with 7", num));
                    
               }
               else if(parity(num)){
                    System.out.println(String.format("It is a Buzz number.\nExplanation:\n %d is divisible by 7", num));
               }
               else{
                    System.out.println(String.format("It is a Buzz number.\nExplanation:\n %d ends with 7", num));
               }

          
          
          
     }
     
}

 */