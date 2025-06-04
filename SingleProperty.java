import java.util.ArrayList;
public class SingleProperty {
    
    static ArrayList<Long> propertyNum(ArrayList<Long> num, String property){
        ArrayList<Long> selectedNum = new ArrayList<>();
        int times = num.size();
        switch (property) {
            case "EVEN":
                for(int i = 0; i < times; i++){
                    if(EvenOdd.isEvenOdd(num.get(i))){
                        selectedNum.add(num.get(i));
                        i++;
                    }
                   
                
                }
                break;
            
            case "ODD":
                for(int i = 0; i < times; i++){
                    if(!EvenOdd.isEvenOdd(num.get(i))){
                        selectedNum.add(num.get(i));
                        i++;
                    }
                    
                
                }
                break;
          
            case "BUZZ":
                for(int i = 0; i < times; i++){
                    if(BuzzNumber.isBuzz(num.get(i))){
                        selectedNum.add(num.get(i));
    
                    }
                    
                
                }
                break;
                
            case "DUCK":
                for(int i = 0; i < times; i++){
                    if(DuckNumber.isDuck(num.get(i))){
                        selectedNum.add(num.get(i));
    
                    }
                    
                
                }
                break;
            
            
            case "GAPFUL":
                for(int i = 0; i < times; i++){
                    if(GapfulNumber.isGapful(num.get(i))){
                        selectedNum.add(num.get(i));
    
                    }
                    
                
                }
                break;
               
                
            
            case "PALINDROMIC":
                for(int i = 0; i < times; i++){
                    if(PalindromicNumber.isPalindrom(num.get(i))){
                        selectedNum.add(num.get(i));
    
                    }
                    
                
                }
                break;
            
            case "SPY":
                for(int i = 0; i < times; i++){
                    if(SpyNumber.isSpy(num.get(i))){
                        selectedNum.add(num.get(i));
        
                    }
                    
                
                }
                break;
            
            

            case "SQUARE":
                for(int i = 0; i < times; i++){
                    if(Square.isSquare(num.get(i))){
                        selectedNum.add(num.get(i));
        
                    }
                    
                
                }
                break;
                
                
            case "SUNNY":
                for(int i = 0; i < times; i++){
                    if(Sunny.isSunny(num.get(i))){
                        selectedNum.add(num.get(i));

                    }
              
                
                }
                break;
        }
        return selectedNum;
    }
}
