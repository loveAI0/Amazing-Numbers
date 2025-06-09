public class Sunny {
    static boolean isSunny(long num) {
        double squareRoot = Math.sqrt(num + 1);
        
        if (squareRoot == Math.floor(squareRoot)) { // Check if it's a perfect square
            return true;
        }
        
       
        return false;
    }

   
}
