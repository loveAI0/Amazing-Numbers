public class DuckNumber {
   static boolean isDuck(long num){
    String strNum = String.valueOf(num);
    /*
     * String strNum = "" + num;
     * String strNum = String.format("%d", num);
     * String strNum = Integer.toString(num);
     * for ascii value
     * String strNum = String.valueOf(num); // valueOf(10);
     */
    return strNum.contains("0");
   } 
}
