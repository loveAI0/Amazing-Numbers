import java.util.Scanner;
class Main{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        //input

        int num = input.nextInt();
        boolean result = EvenOdd.isNatural(num);

        if (result) {
            boolean buzz = BuzzNumber.isBuzz(num);
        }
        

        
    }
}