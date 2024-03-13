
package relationaloperators;

import java.util.Scanner;
/*
Note:- 
1. switch case is allowed for 
    a). byte    -> case 1:
    b). short   -> case 1:
    c). int     -> case 1:

    d). char    -> case 'a':
    e). String  -> case "File":

2. switch case is not allowed for 
    a). float (type value)

*/

public class SwitchCase {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Day no.: ");
        int day = sc.nextInt();
        
        switch(day){
            case 1: 
                System.out.println("Mon");
                break;
            case 2: 
                System.out.println("Tue");
                break;
            case 3: 
                System.out.println("Wed");
                break;
            case 4: 
                System.out.println("Thur");
                break;
            case 5: 
                System.out.println("Fri");
                break;
            case 6: 
                System.out.println("Sat");
                break;
            case 7: 
                System.out.println("Sun");
                break;
            default:
                System.out.println("Invalid Choice you input");
                break;
        }
        
    }
    
}
