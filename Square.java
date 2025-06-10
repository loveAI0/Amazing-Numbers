public class Square {
    static boolean isSquare(long num){
       long sqrt = (long) Math.sqrt(num);
       return sqrt * sqrt == num;
    }
}
