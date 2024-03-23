
package relationaloperators;

import java.util.Scanner;


public class DisplayTheNumberBasedOnNumber {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day number (1-7):");
        int day = sc.nextInt();
        
        if(day == 1){
            System.out.println("Monday");
        } else if(day == 2){
            System.out.println("Tuesday");
        } else if(day == 3){
            System.out.println("Wed");
        } else if(day == 4){
            System.out.println("Thur");
        } else if(day == 5){
            System.out.println("Fri");
        } else if(day == 6){
            System.out.println("Sat");
        } else if(day == 7){
            System.out.println("Sun");
        } else {
            System.out.println("Invalid Day Number!");
        }

    }
    
}

/*
Output:-
---------
Enter day number (1-7):
8
Invalid Day Number!

Enter day number (1-7):
6
Sat


*/
