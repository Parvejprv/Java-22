
package pkg10.methods;

import java.util.Scanner;


public class reverseANumber {
    
    // Reverse a number 
    static int reverseNum(int num){
        int rev = 0;
        while(num != 0){
            // rev = rev*10 + last digit
            rev = rev*10 + (num%10);
            num /= 10;
        }
        return rev;
    }

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        
        // Reverse a number
        int ans = reverseNum(num);
        System.out.println("Reverse of a number is = " + ans);
    }
    
}


/*
Output:-
---------
Enter a number: 
12345
Reverse of a number is = 54321

*/
