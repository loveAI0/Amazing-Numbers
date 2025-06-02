public class BuzzNumber {

    static boolean isBuzz(int num){
        

        while (num >= 10) { // Reduce until single-digit
            int lastDigit = num % 10;
            if(lastDigit == 7) return true;
            else    num = num / 10 - 2 * lastDigit;
            
        }
        return num % 7 == 0;

    }
}