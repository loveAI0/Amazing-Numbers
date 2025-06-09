import java.util.ArrayList;
public class SingleProperty {
    
    static ArrayList<Long> propertyNum(long num, long times, String property){
        ArrayList<Long> selectedNum = new ArrayList<>();
        
        switch (property) {
            case "EVEN":
                int i = 0;
                while(i != times){
                    if(EvenOdd.isEvenOdd(num)){
                        selectedNum.add(num);
                        num +=1; 
                        i++;
                    }
                    num++;
                   
                
                }
                break;
            
            case "ODD":
                i = 0;
                while(i != times){ 
                    if(!EvenOdd.isEvenOdd(num)){
                        selectedNum.add(num);
                        num +=1;
                        i++;
                    }
                    num++;
                    
                
                }
                break;
          
            case "BUZZ":
                i = 0;
                while(i != times){ 
                    if(BuzzNumber.isBuzz(num)){
                        selectedNum.add(num);
                        i++;
                    }
                    num++;
                    
                
                }
                break;
                
            case "DUCK":
                i = 0;
                while(i != times){ 
                    if(DuckNumber.isDuck(num)){
                        selectedNum.add(num);
                        i++;
                    }
                    
                    num++;
                }
                break;
            
            
            case "GAPFUL":
                i = 0;
                while(i != times){ 
                    if(GapfulNumber.isGapful(num)){
                        selectedNum.add(num);
                        i++;
    
                    }
                    num++;
                    
                
                }
                break;
               
                
            
            case "PALINDROMIC":
                i = 0;
                while(i != times){ 
                    if(PalindromicNumber.isPalindrom(num)){
                        selectedNum.add(num);
                        i++;
                        
    
                    }
                    num++;
                    
                
                }
                break;
            
            case "SPY":
                i = 0;
                while(i != times){ 
                    if(SpyNumber.isSpy(num)){
                        selectedNum.add(num);
                        i++;
        
                    }
                    num++;
                
                }
                break;
            
            

            case "SQUARE":
                i = 0;
                while(i != times){ 
                    if(Square.isSquare(num)){
                        selectedNum.add(num);
                        i++;
        
                    }
                    num++;
                
                }
                break;
                
                
            case "SUNNY":
                i = 0;
                
                while(i != times){ 
                    if(Sunny.isSunny(num)){
                        selectedNum.add(num);
                        i++;
                    }
              
                    num++;
                }
                break;
        }
        return selectedNum;
    }
}
