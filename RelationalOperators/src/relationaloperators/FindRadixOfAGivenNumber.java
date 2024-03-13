
package relationaloperators;
import java.util.*;

public class FindRadixOfAGivenNumber {

    
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter number: ");
         String num = sc.nextLine();
         
         if(num.matches("[01]+")){
             System.out.println("Binary Radix=2");
         } else if(num.matches("[0-7]+")){
             System.out.println("Octal Radix=8");
         } else if(num.matches("[0-9]+")){
             System.out.println("Decimal Radix=10");
         } else if(num.matches("[0-9A-F]+")){
             System.out.println("Hexa-decimal Radix=16");
         } else {
             System.out.println("Not a Number");
         }
    }
    
    
    
    
    /*
    // Find Radix of a Given number
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        String num = sc.nextLine();
        
        if(num.matches("[01]+")){
            System.out.println("Binary Radix=2");
        } else {
            if(num.matches("[0-7]+")){
               System.out.println("Octal Radix=8");
            } else {
                if(num.matches("[0-9]+")){
                    System.out.println("Decimal Radix=10");
                } else {
                    if(num.matches("[0-9A-F]+")){
                        System.out.println("Hexa-Decimal Radix=16");
                    } else {
                        System.out.println("Not a Number");
                    }
                }
            }
        }
        
        
    }
    
    */
    
}


/*
Output:-
---------
Enter a number: 
100110
Binary Radix=2


Enter a number: 
12567
Octal Radix=8


Enter a number: 
1012ABF
Hexa-Decimal Radix=16


Enter a number: 
9876
Decimal Radix=10
*/