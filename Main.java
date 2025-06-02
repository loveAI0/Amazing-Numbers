import java.util.Scanner;
class Main{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        //input

        int num = input.nextInt();
        boolean result = EvenOdd.isNatural(num);


        if (result){
            boolean isEven = EvenOdd.isEvenOdd(num);
            boolean isBuzz = BuzzNumber.isBuzz(num);
            boolean isDuck = DuckNumber.isDuck(num);
            String output = String.format("""
                   Properties of %d
                   even: %b
                    odd: %b
                   buzz: %b
                   duck: %b
                    """, num, isEven, !isEven, isBuzz, isDuck);
            System.out.println(output);
        }else System.out.println("This number is not natural!");
                    
                
        
        

        
    }
}