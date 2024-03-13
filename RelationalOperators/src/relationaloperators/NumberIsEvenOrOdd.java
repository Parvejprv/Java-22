
package relationaloperators;
import java.util.*;

public class NumberIsEvenOrOdd {
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int m1, m2, m3;
       
        System.out.println("Enter the marks m1, m2, m3:");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        
        float avg = (m1+m2+m3)/3;
        
        if(avg > 70){
            System.out.println("Grade A");
        } else if (avg >= 60 && avg < 70){
            System.out.println("Grade B");
        } else if(avg >= 50 && avg < 60){
            System.out.println("Grade C");
        } else if(avg >= 40 && avg < 50){
            System.out.println("Grade D");
        } else {
            System.out.println("Grade E");
        }
        
        
    }
    
    
    
    
    
    
    /*
    // Young or not young
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int age;
        System.out.println("Enter age: ");
        age = sc.nextInt();
        
        if(age >= 14 && age <= 55){
            System.out.println("Young.");
        } else if(age < 14 || age > 55){
            System.out.println("Not Young.");
        }
        
    }
    */
    
    
    
    
    /*
    // Even Or Odd
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        
        if(num % 2 == 0){
            System.out.println("It is a Even number");
        } else {
            System.out.println("It is a Odd number");
        }
        
    }
    */
    
}


/*
Output:-
---------
Enter the number: 
119
Odd


Enter the number: 
54
Even

*/