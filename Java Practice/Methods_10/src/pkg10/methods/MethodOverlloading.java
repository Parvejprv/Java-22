
package pkg10.methods;

import java.util.Scanner;

public class MethodOverlloading {
    
    static int max(int x, int y){
        return x>y?y:x;
    }
    
    static float max(float x, float y){
        if(x>y)
            return x;
        else
            return y;
    }

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // enter two integer number
        System.out.println("Enter the 1st integer a:");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd integer b:");
        int b = sc.nextInt();
        
        // enter two floating point number
        System.out.println("Enter the 1st Floating point number c:");
        float c = sc.nextFloat();
        System.out.println("Enter the 2md Floating point number d:");
        float d = sc.nextFloat();
        
        
        // (float) max is called
        System.out.println("Floating point maximum number is: " + max(c, d));
        
        // (integer) max is called
        System.out.println("Integer maximum number is: " + max(a,b));
    }
    
}





/*
Output:-
--------
Enter the 1st integer a:
100
Enter the 2nd integer b:
2000
Enter the 1st Floating point number c:
20.56
Enter the 2md Floating point number d:
80.54
Floating point maximum number is: 80.54
Integer maximum number is: 100


*/
