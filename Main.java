import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
class Main{
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        
        //Welcome 
    
        
        System.out.println("""
                Welcome to Amazing Numbers!

                Supported requests:
                - enter a natural number to know its properties;
                - enter two natural numbers to obtain the properties of the list:
                * the first parameter represents a starting number;
                * the second parameter shows how many consecutive numbers are to be printed;
                - two natural numbers and a property to search for;
                - separate the parameters with one space;
                - enter 0 to exit.""");
       
        while(true){
            //input
            System.out.println("Enter a request: ");
            //either one or two values
            String numStr = input.nextLine();
            String[] arr1 = numStr.split(" ");
            //checking the continuity of loop.
            if(Long.parseLong(arr1[0]) == 0){
                
                input.close();
                System.out.println("\n\nGoodBye!");
                break;
                
            }
            
            
            if(arr1.length == 1){
                long[] arr = new long[1];

                arr[0] = Long.parseLong(arr1[0]);
                
                boolean result = EvenOdd.isNatural(arr[0]);
                if(result){ 
                    boolean isEven = EvenOdd.isEvenOdd(arr[0]);
                    boolean isBuzz = BuzzNumber.isBuzz(arr[0]);
                    boolean isDuck = DuckNumber.isDuck(arr[0]);
                    boolean isPalindrom = PalindromicNumber.isPalindrom(arr[0]);
                    boolean isGapful = GapfulNumber.isGapful(arr[0]);
                    boolean isSpy = SpyNumber.isSpy(arr[0]);
                    boolean isSunny = Sunny.isSunny(arr[0]);
                    boolean isSquare = Square.isSquare(arr[0]);
                    String output = String.format("""
                            Properties of %,d
                                    buzz: %b
                                    duck: %b
                             palindromic: %b
                                  gapful: %b
                                   sunny: %b
                                  square: %b
                                     spy: %b
                                    even: %b
                                     odd: %b
                                """, arr[0],isBuzz, isDuck, isPalindrom,isGapful,isSunny,isSquare,isSpy,isEven, !isEven);
                    System.out.println(output);
                }
                else{
                    System.out.println("The first parameter should be a natural number or zero.");
                
                } 
                
            }
            else if(arr1.length == 2){
                long[] arr = new long[2];
                arr[0] = Long.parseLong(arr1[0]);
                
                arr[1] = Long.parseLong(arr1[1]);
                boolean result1 = EvenOdd.isNatural(arr[0]);
                boolean result2 = EvenOdd.isNatural(arr[1]);

                if (result1 && result2) {
                    for (long j = arr[0], k = 0; k < arr[1]; k++, j++) {

                        StringBuilder sb = new StringBuilder(j + " is ");
                        List<String> properties = new ArrayList<>();

                        if (BuzzNumber.isBuzz(j)) properties.add("buzz");
                        if (DuckNumber.isDuck(j)) properties.add("duck");
                        if (PalindromicNumber.isPalindrom(j)) properties.add("palindromic");
                        if (GapfulNumber.isGapful(j)) properties.add("gapful");
                        if (SpyNumber.isSpy(j)) properties.add("spy");
                        properties.add(EvenOdd.isEvenOdd(j) ? "even" : "odd");

                        sb.append(String.join(" ", properties));
                        System.out.println(sb);
                        
                                            
                    }
                }

                else{
                
                    if(!result1){
                        System.out.println("The first parameter should be a natural number or zero.");
                    }
                    else if(!result2){
                        System.out.println("The second parameter should be a natural number.");
                    }

                }
            }
            else if(arr1.length == 3){
                // number times and properties
                
                ArrayList <String> properties = new ArrayList<>(Arrays.asList("BUZZ", "DUCK", "PALINDROMIC", "GAPFUL", "SPY", "SUNNY", "SQUARE","EVEN", "ODD"));

                long[] arr = new long[2];
                arr[0] = Long.parseLong(arr1[0]);
                arr[1] = Long.parseLong(arr1[1]);
                // arr1 is input string
                if(!properties.contains(arr1[2].toUpperCase())){
                    System.out.println(String.format("""
                            The property [%s] is wrong.
                            Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SUNNY, SQUARE, EVEN, ODD]
                            """, arr1[2]));
                    
                }
                
                boolean result1 = EvenOdd.isNatural(arr[0]);
                 boolean result2 = EvenOdd.isNatural(arr[1]);

                if (result1 && result2) {
                    long num1 = arr[0];
                    int times = (int) arr[1];
                    String prop1 = arr1[2];
                    ArrayList<Long> numParameter = new ArrayList<>();
                    

                       
                    numParameter = SingleProperty.propertyNum(num1,times, prop1);
                        
                    
                    Output.printArrayList(numParameter);
                }

                else{
                    if(!result1){
                        System.out.println("The first parameter should be a natural number or zero.");
                    }
                    else if(!result2){
                        System.out.println("The second parameter should be a natural number or zero.");
                    }
                
                }



            
            }
            else if(arr1.length == 4){
                // number times and properties
                
                ArrayList <String> properties = new ArrayList<>(Arrays.asList("BUZZ","SUNNY","SQUARE", "DUCK", "PALINDROMIC", "GAPFUL", "SPY", "EVEN", "ODD"));
              
                // exclusive properties of numbers
                Map<String, String> exclusiveProperties = new HashMap<>();
                exclusiveProperties.put("EVEN", "ODD");
                exclusiveProperties.put("DUCK", "SPY");
                exclusiveProperties.put("SUNNY", "SQUARE");
                exclusiveProperties.put("ODD", "EVEN");
                exclusiveProperties.put("SPY", "DUCK");
                exclusiveProperties.put("SQUARE", "SUNNY");
                


                long[] arr = new long[2];
                arr[0] = Long.parseLong(arr1[0]);
                arr[1] = Long.parseLong(arr1[1]);
                // arr1 is input string
                
                if(!properties.contains(arr1[2].toUpperCase()) && !properties.contains(arr1[3].toUpperCase())){
                     System.out.println(String.format("""
                           The property [%s %s] is wrong.
                            Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SUNNY, SQUARE, EVEN, ODD]
                            """, arr1[2], arr1[3]));
                   
                }
                else if(!properties.contains(arr1[2].toUpperCase())){
                     System.out.println(String.format("""
                           The property [%s] is wrong.
                           Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SUNNY, SQUARE, EVEN, ODD]
                            """, arr1[2]));
                    
                }
                else if(!properties.contains(arr1[3].toUpperCase())){
                    System.out.println(String.format("""
                           The property [%s] is wrong.
                            Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SUNNY, SQUARE, EVEN, ODD]
                            """,arr1[3]));
                    
                }
                else if(exclusiveProperties.get(arr1[2]).equals(arr1[3])){
                    System.out.println(String.format("""
                            The request contains mutually exclusive properties: [%s, %s]
                            There are no numbers with these properties.
                            """, arr1[2], arr1[3]));
                        
                   
                }
                
                else {
                    boolean result = EvenOdd.isNatural(arr[0]);
                

                    if (result){
                        long num1 = arr[0];
                       
                        int times = (int) arr[1];
                        
                     
                        String prop1 = arr1[2];
                      
                        String prop2 = arr1[3];
                       
                        
                        ArrayList<Long> numParameter = new ArrayList<>();
                    

                       
                        numParameter = SingleProperty.propertyNum(num1,times, prop1);
                        
                        numParameter = doubleProperty.propertyNum(numParameter, prop2);
                        Output.printArrayList(numParameter);


                        
                        
                            
                    }
                    else{ System.out.println("The first parameter should be a natural number or zero.");
                    }
                }
           }       
        }
    }
}