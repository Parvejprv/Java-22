
package pkg10.methods;

import java.util.Scanner;

public class MethodOverloadingPractice {
    
    // Area of an Rectangle
    static float recArea(int l, int b){
        return (l*b);
    }
    
    // Area of a Cirlce
    static double cirArea(double rad){
        return Math.PI*(rad*rad);
    }
    
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the length of the rectangle:");
        int l = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle:");
        int b = sc.nextInt();
        
        // Area of Rectangle
        System.out.println("Rectangle Area = " + recArea(l,b));
        
        // Enter the radius of a circle
        System.out.println("Enter the radius of the circle: ");
        Double r = sc.nextDouble();
        
        System.out.println("Area of a Circle is = " + cirArea(r));
    }
    
}



/*
Output:-
---------
Enter the length of the rectangle:
2 4
Enter the breadth of the rectangle:
Rectangle Area = 8.0
Enter the radius of the circle: 
5
Area of a Circle is = 78.53981633974483

*/
