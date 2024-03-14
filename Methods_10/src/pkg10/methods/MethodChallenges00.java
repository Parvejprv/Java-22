
package pkg10.methods;

import java.util.Scanner;


public class MethodChallenges00 {

    /* Find a Number is Prime */
    /* Find GCD of 2 number */
    /* Find Maximum element in an array */
    
    
    
    
    
    /* Find a Number is Prime */
    static boolean isPrime(int num){
        
        for(int i=2; i<num/2; i++){
            if(num%i == 0)
                return false;
        }
        return true;
    }
    
    /* Find GCD of 2 number */
    
    /* Find Maximum element in an array */
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a integer number :");
        int num  = sc.nextInt();
        
        if(isPrime(num))
            System.out.println("Number " + num + " is Prime.");
        else
            System.out.println("Number " + num +" is not Prime.");
    }
    
    
    
    
}





/*
#1. isPrime()

Output:-
--------
Enter a integer number :
19
Number 19 is Prime.

Enter a integer number :
91
Number 91 is not Prime.









*/