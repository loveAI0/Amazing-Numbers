public class PalindromicNumber {

    static boolean isPalindrom(long num){
        String numStr = String.valueOf(num);
        System.out.println(numStr);
        int length = numStr.length();
        
        int i = 0, j = length - 1;
        while(i < j){
            
            if(numStr.charAt(i) != numStr.charAt(j)){
                
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}
