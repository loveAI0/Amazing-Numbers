public class BuzzNumber {

    static boolean isBuzz(long num){
        

        while (num >= 10) { // Reduce until single-digit
            long lastDigit = num % 10;
            if(lastDigit == 7) return true;
            else    num = num / 10 - 2 * lastDigit;
            
        }
        return num % 7 == 0;

    }
}