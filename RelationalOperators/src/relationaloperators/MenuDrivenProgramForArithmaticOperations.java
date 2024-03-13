
package relationaloperators;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class MenuDrivenProgramForArithmaticOperations {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Menu");
        System.out.println("=====");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        System.out.println();
        
        
        System.out.println("Enter 2 numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Options in Words: ");
        String option = sc.nextLine().toUpperCase();
//        option = option.toUpperCase();      // upper case
        
        
        switch(option) {
            case "ADD" : System.out.println("Addition of " + x + " and " + y + " is = " + (x+y));
                break;
            case "SUB" : System.out.println("Subtraction of " + x + " and " + y + " is = " + (x-y));
                break;
            case "MUL" : System.out.println("Multiplication of " + x + " and " + y + " is = " + (x*y));
                break;
            case "DIV" : System.out.println("Division of " + x + " and " + y + " is = " + (x/y));
                break;
            default : System.out.println("Invalid Choice, You have Entered.");
                break;
        
        }
        
    }
    
}



/*
Output:-
---------
Menu
=====
ADD
SUB
MUL
DIV
Enter 2 numbers: 
5 6
Enter Options in Words: 
MUL
Multiplication of 5 and 6 is = 30




Menu
=====
ADD
SUB
MUL
DIV

Enter 2 numbers: 
90 10
Enter Options in Words: 
SUB
Subtraction of 90 and 10 is = 80
*/
