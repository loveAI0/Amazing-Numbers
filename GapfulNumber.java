public class GapfulNumber {
    static boolean isGapful(long num){
        String strNum = String.valueOf(num);
        int length = strNum.length();

        // extracting first and last
        String firstLastNum = "" + strNum.charAt(0) + strNum.charAt(length - 1);

        
        return num % Long.parseLong(firstLastNum) == 0;
    }
    public static void main(String[] args) {
        System.out.println(isGapful(7880));
    }
}
