/*
Question 1: Find GCD of two numbers using for loop and if statement

*/
package pkg10.methods;

import java.util.Scanner;



public class MethodChallenges002 {
    static int gcd(int num1, int num2){
        
        // always return positive 
        num1 = num1 > 0 ? num1 : -num1;
        num2 = num2 > 0 ? num2 : -num2;
        
        // Check if n1 != n2, i.e. num1 is not equals to num2
        if(num1 == num2)
            return num1;
        
        while(num1 != num2){
            // Check if num1 is greater
            if(num1 > num2){
                num1 -= num2;
            }
            // Otherwise,  num2 is greater
            else {
                num2 -= num1;
            }
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st integer number :");
        int num  = sc.nextInt();
        System.out.println("Enter 2nd integer number :");
        int num2  = sc.nextInt();
        
        int gcdRes = gcd(num, num2);
        System.out.println("GCD of two integer number ("+ num +","+ num2 +") is = " + gcdRes);
    }
}


/*
Output:-
----------
Enter 1st integer number :
81
Enter 2nd integer number :
153
GCD of two integer number (81,153) is = 9


Enter 1st integer number :
81 
Enter 2nd integer number :
-153
GCD of two integer number (81,-153) is = 9

*/


















/*
//Solution 1. Using the for loop and if statement

public class MethodChallenges002 {
    static int gdcOfTwoNumber(int num, int num2){
        int gcd = 1;
        
        for(int i=1; i<=num && i<=num2; i++){
            if(num%i == 0 && num2%i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st integer number :");
        int num  = sc.nextInt();
        System.out.println("Enter 2nd integer number :");
        int num2  = sc.nextInt();
        
        int gcdRes = gdcOfTwoNumber(num, num2);
        System.out.println("GCD | HCF of two integer number ("+ num +","+ num2 +") is = " + gcdRes);
    }
}

*/







/* Find GCD of 2 number */
/*
Output:-
---------
Enter 1st integer number :
81
Enter 2nd integer number :
153
GCD | HCF of two integer number (81,153) is = 9


*/