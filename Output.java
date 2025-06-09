import java.util.ArrayList;
public class Output {
    static void printArrayList(ArrayList<Long> numSelected){
        int k = 0, j = 0;
        while(k != numSelected.size()){
            StringBuilder sb = new StringBuilder();
             j = numSelected.get(k).intValue();
             sb.append(String.format("%,d", j)).append(" is ");
            
            if (BuzzNumber.isBuzz(j)) sb.append("buzz ");
            if (DuckNumber.isDuck(j)) sb.append("duck ");
            if (PalindromicNumber.isPalindrom(j)) sb.append("palindromic ");
            if (GapfulNumber.isGapful(j)) sb.append("gapful ");
            if(SpyNumber.isSpy(j)) sb.append("spy ");
            if (Sunny.isSunny(j)) sb.append("sunny ");
            if(Square.isSquare(j)) sb.append("square ");
            if (EvenOdd.isEvenOdd(j)) sb.append("even ");
            else sb.append("odd ");
            System.out.println(sb.toString().trim());
            k++;
        }
    }
}
