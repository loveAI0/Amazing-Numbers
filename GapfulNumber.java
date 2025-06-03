public class GapfulNumber {
    static boolean isGapful(long num){
        String strNum = String.valueOf(num);
        int length = strNum.length();
        if(length == 1 || length == 2) return false;
        // extracting first and last
        String firstLastNum = "" + strNum.charAt(0) +""+ strNum.charAt(length - 1);

        
        return num % Long.parseLong(firstLastNum) == 0;
    }
    
}
