
package stringpractice3;
import static java.lang.String.valueOf;     // static method
import java.util.*;


public class StudentChallenges2 {

    
    public static void main(String[] args) {
        
        /*
        Challenge 1. find a number that is binary or not.
        */
        int b = 10110001;
        
        // String str = b + "";      // OR
        String str = valueOf(b);
        
        // using regex
        // System.out.println(str.matches("[01]*"));
        System.out.println(str.matches("[01]+"));
        
        
        
        
        /*
        *******************************************************************************
        */
        /*
        Challenge 2. find a number that is Hexa-Decimal or not.
        */
        
        String str2 = "234AB";
        System.out.println(str2.matches("[0-9A-F]+"));  //true
        
        String str3 = "234ABZ";
        System.out.println(str3.matches("[0-9A-F]+"));  //false
        
       
        
        /*
        *******************************************************************************
        */
        /*
        Challenge 3. find the data in date format (dd/mm/yyyy)
        */
        
        String d = "01/12/2000";
        System.out.println(d.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));  //true
        
        
        
        
        
        
        
    }
    
}
