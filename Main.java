import java.util.Scanner;
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
                * the second parameter shows how many consecutive numbers are to be processed;
                - separate the parameters with one space;
                - enter 0 to exit.""");
       
        while(true){
            //input
            System.out.print("Enter a request: ");
            //either one or two values
            String numStr = input.nextLine();
            String[] arr1 = numStr.split(" ");
            //checking the continuity of loop.
            if(Long.parseLong(arr1[0]) == 0){
                
                input.close();
                System.out.println("\n\nGoodBye!");
                break;
            }
            
            if(arr1.length == 2){
                long[] arr = new long[2];
                arr[0] = Long.parseLong(arr1[0]);
                arr[1] = Long.parseLong(arr1[1]);
                boolean result = EvenOdd.isNatural(arr[0]);


                if (result){
                    for(long j = arr[0], k = 0 ; k < arr[1]; k++, j++){
                    
                        StringBuilder sb = new StringBuilder();
                        sb.append(j).append(" is ");

                        if (BuzzNumber.isBuzz(j)) sb.append("buzz ");
                        if (DuckNumber.isDuck(j)) sb.append("duck ");
                        if (PalindromicNumber.isPalindrom(j)) sb.append("palindromic ");
                        if (GapfulNumber.isGapful(j)) sb.append("gapful ");
                        if (EvenOdd.isEvenOdd(j)) sb.append("even ");
                        else sb.append("odd ");

                        System.out.println(sb.toString().trim()); // Removes extra spaces
                    }
                }

                else{
                    System.out.println("The first parameter should be a natural number or zero.");
                
                } 
            }
            else{
                long[] arr = new long[1];
                arr[0] = Long.parseLong(arr1[0]);
                boolean result = EvenOdd.isNatural(arr[0]);
                if(result){ 
                    boolean isEven = EvenOdd.isEvenOdd(arr[0]);
                    boolean isBuzz = BuzzNumber.isBuzz(arr[0]);
                    boolean isDuck = DuckNumber.isDuck(arr[0]);
                    boolean isPalindrom = PalindromicNumber.isPalindrom(arr[0]);
                    boolean isGapful = GapfulNumber.isGapful(arr[0]);
                    String output = String.format("""
                            Properties of %,d
                                    buzz: %b
                                    duck: %b
                             palindromic: %b
                                  gapful: %b
                                    even: %b
                                     odd: %b
                                """, arr[0],isBuzz, isDuck, isPalindrom,isGapful,isEven, !isEven);
                    System.out.println(output);
                }
                else{
                    System.out.println("The first parameter should be a natural number or zero.");
                
                } 
                
            }
        }       
    }
}