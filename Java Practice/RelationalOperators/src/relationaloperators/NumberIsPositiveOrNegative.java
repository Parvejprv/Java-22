
package relationaloperators;
import java.util.*;

public class NumberIsPositiveOrNegative {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        if(num >= 0){
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

    }
    
}


/*
Output:-
----------
Enter a number: 
20
Positive


Enter a number: 
-100
Negative


Enter a number: 
0
Positive
*/
