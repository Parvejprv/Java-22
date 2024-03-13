
package relationaloperators;
import java.util.Scanner;


public class FindAGivenYearIsLeapYearOrNot {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter year:");
        int year = sc.nextInt();
        
        boolean leapYear = false;
        
        // if the year is divided by 4, but not divisible by 100
        if(year % 4 == 0 && year % 100 != 0){
           leapYear = true;
        } else if(year % 400 == 0) {
            leapYear = true;
        } else {
            leapYear = false;
        }
        
        
        // if year is leap
        if(leapYear){
            System.out.println("Leap Year!");
        } else {
            System.out.println("Not a Leap Year.");
        }
        
    }
    
    
    
    
    /*
    Output:-
    ----------
    Enter year:
    2024
    Leap Year!
    
    Enter year:
    1600
    Leap Year!
    
    Enter year:
    1700
    Not a Leap Year.
    
    Enter year:
    1800
    Not a Leap Year.
    
    Enter year:
    1900
    Not a Leap Year.
    
    Enter year:
    2000
    Leap Year!
    */
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    // Leap Year Solution 2.
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter year:");
        int year = sc.nextInt();
        
        boolean leapYear = false;
        
        // if the year is divided by 4
        if(year % 4 == 0){
            
            // check if year is a century
            if(year % 100 == 0){
                
                // check if year divided by 400 also,
                if(year % 400 == 0){
                    leapYear = true;
                } else {
                    leapYear = false;
                }
                
            } else {
                leapYear = true;
            }
            
        } else {
            leapYear = true;
        }
        
        // if year is leap
        if(leapYear){
            System.out.println("Leap Year!");
        } else {
            System.out.println("Not a Leap Year.");
        }
        
    }
    */
    
    
    
    
    
    
    
    /*
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Year:");
        int year = sc.nextInt();
        
        // if a year is divisible by 4 but not divisble by 100.
        if(year % 4 == 0){
            if(year % 100 == 0){
                // not a leap year check for 400 also
                if(year % 400 == 0){
                    System.out.println("Leap Year!");
                } else {
                    System.out.println("Not a Leap Year.");
                }
            } else {
                System.out.println("Leap Year!");
            }
        } else {
            System.out.println("Not a Leap Year..");
        }

    }
    */
    
}


/*
Output:-
--------
Enter Year:
2019
Not a Leap Year..

Enter Year:
2016
Leap Year!

Enter Year:
1700
Not a Leap Year.


Enter Year:
1800
Not a Leap Year.

Enter Year:
1900
Not a Leap Year.
*/