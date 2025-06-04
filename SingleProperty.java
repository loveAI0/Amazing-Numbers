import java.util.ArrayList;
public class SingleProperty {
    
    static ArrayList<Long> propertyNum(long num, long times, String property){
        ArrayList<Long> selectedNum = new ArrayList<>();

        switch (property) {
            case "EVEN":
                for(int i = 0; i < times; i++){
                    if(EvenOdd.isEvenOdd(num)){
                        selectedNum.add(num);
                        num += 2;
                    }
                    else num++;
                
                }
                break;
            
            case "ODD":
                for(int i = 0; i < times; i++){
                    if(!EvenOdd.isEvenOdd(num)){
                        selectedNum.add(num);
                        num +=2;
                    }
                    else num++;
                
                }
                break;
          
            case "BUZZ":
                for(int i = 0; i < times; i++){
                    if(BuzzNumber.isBuzz(num)){
                        selectedNum.add(num);
                        num++;
                    }
                    else num++;
                
                }
                break;
                
            case "DUCK":
                for(int i = 0; i < times; i++){
                    if(DuckNumber.isDuck(num)){
                        selectedNum.add(num);
                        num++;
                    }
                    else num++;
                
                }
                break;
            
            
            case "GAPFUL":
                for(int i = 0; i < times; i++){
                    if(GapfulNumber.isGapful(num)){
                        selectedNum.add(num);
                        num++;
                    }
                    else num++;
                
                }
                break;
               
                
            
            case "PALINDROMIC":
                for(int i = 0; i < times; i++){
                    if(PalindromicNumber.isPalindrom(num)){
                        selectedNum.add(num);
                        num++;
                    }
                    else num++;
                
                }
                break;
            
            case "SPY":
                for(int i = 0; i < times; i++){
                    if(SpyNumber.isSpy(num)){
                        selectedNum.add(num);
                        num++;
                    }
                    else num++;
                
                }
                break;
            
            

            case "SQUARE":
                for(int i = 0; i < times; i++){
                    if(Square.isSquare(num)){
                        selectedNum.add(num);
                        num++;
                    }
                    else num++;
                
                }
                break;
                
                
            case "SUNNY":
                for(int i = 0; i < times; i++){
                    if(Sunny.isSunny(num)){
                        selectedNum.add(num);
                        num++;
                    }
                    else num++;
                
                }
                break;
        }
        return selectedNum;
    }
}
