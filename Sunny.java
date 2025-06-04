public class Sunny {
    static boolean isSunny(long num){
        double square = Math.sqrt(num) * Math.sqrt(num);
        
        if(square * square - 1 == num){
            return true;
        }
        return false;
        
    }
}
