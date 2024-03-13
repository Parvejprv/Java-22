
package relationaloperators;

import java.util.Scanner;


public class PracticeSwitchCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number(1-3): ");
        int n = sc.nextInt();
        
        switch(n){
            case 1:    System.out.println("One");
                break;
            case 2:    System.out.println("Two");
                break;
            case 3:    System.out.println("Three");
                break;
            default:    System.out.println("Not Valid");
                break;
        }
    }
    
    
    
    /*
    // if - else
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        
        if(n==1){
            System.out.println("One");
        } else if(n==2){
            System.out.println("Two");
        }
        else if(n==3){
            System.out.println("Three");
        } else {
            System.out.println("Not Valid");
        }
    }
    */
}



/*
Output:-
--------
Enter number: 
5
Not Valid
*/