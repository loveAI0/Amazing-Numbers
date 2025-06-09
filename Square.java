public class Square {
    static boolean isSquare(long num){
        double square = Math.sqrt(num) * Math.sqrt(num);
        
        if(square * square == num){
            return true;
        }
        return false;
        
    }
}
