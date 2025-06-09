public class SpyNumber {
    static boolean isSpy(long num){
        if(num < 10) return true;

        else{
            long mul = 1, sum = 0;
            while(num > 0){

                mul *= num % 10;
                sum += num % 10;
                num /= 10;
            }
            if(mul == sum){
                return true;
            }
            return false;
        }
    }
}
 