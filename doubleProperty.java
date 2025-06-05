import java.util.ArrayList;

public class doubleProperty {


     static ArrayList<Long> propertyNum(ArrayList<Long> num, String property){
        ArrayList<Long> selectedNum = new ArrayList<>();
        int times = num.size();
        switch (property) {
            case "EVEN":
                int i = 0;
                while(i != times){
                    if(EvenOdd.isEvenOdd(num.get(i))){
                        selectedNum.add(num.get(i));
                        
                        
                    }
                    i++;
                   
                
                }
                break;
            
            case "ODD":
                i = 0;
                while(i != times){ 
                    if(!EvenOdd.isEvenOdd(num.get(i))){
                        selectedNum.add(num.get(i));
                        
                        
                    }
                    i++;
                    
                
                }
                break;
          
            case "BUZZ":
                i = 0;
                while(i != times){ 
                    if(BuzzNumber.isBuzz(num.get(i))){
                        selectedNum.add(num.get(i));
                        
                    }
                    i++;
                    
                
                }
                break;
                
            case "DUCK":
                i = 0;
                while(i != times){ 
                    if(DuckNumber.isDuck(num.get(i))){
                        selectedNum.add(num.get(i));
                        
                    }
                    
                    i++;
                }
                break;
            
            
            case "GAPFUL":
                i = 0;
                while(i != times){ 
                    if(GapfulNumber.isGapful(num.get(i))){
                        selectedNum.add(num.get(i));
                        
    
                    }
                    i++;
                    
                
                }
                break;
               
                
            
            case "PALINDROMIC":
                i = 0;
                while(i != times){ 
                    if(PalindromicNumber.isPalindrom(num.get(i))){
                        selectedNum.add(num.get(i));
                        
                        
    
                    }
                    i++;
                    
                
                }
                break;
            
            case "SPY":
                i = 0;
                while(i != times){ 
                    if(SpyNumber.isSpy(num.get(i))){
                        selectedNum.add(num.get(i));
                        
        
                    }
                    i++;
                
                }
                break;
            
            

            case "SQUARE":
                i = 0;
                while(i != times){ 
                    if(Square.isSquare(num.get(i))){
                        selectedNum.add(num.get(i));
                        
        
                    }
                    i++;
                
                }
                break;
                
                
            case "SUNNY":
                i = 0;
                System.out.println("i am invoked");
                while(i != times){ 
                    if(Sunny.isSunny(num.get(i))){
                        selectedNum.add(num.get(i));
                        
                    }
              
                    i++;
                }
                break;
        }
        return selectedNum;
    }
}
