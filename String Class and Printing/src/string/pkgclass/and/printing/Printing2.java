
package string.pkgclass.and.printing;
import java.util.*;

public class Printing2 {

   
    public static void main(String[] args) {
//        int a = 10;
        int a = 10;
        int b = -10;
//        float num = 123.45f;    // presecion
        float num = 3.45f;    // if the number is small but width is more then it will filled with 0
        
        System.out.printf("%5d\n", a);      // this will print the number at the 5 place (including). - with
        System.out.printf("%05d\n", a);      // this will print the number at the 5 place ( including). - flag ('-', '+', '0', true )
        System.out.printf("%(5d\n", b);      // include bracket if number is negative
        System.out.printf("%-5d\n", b);      // flag as negative
        System.out.printf("%+5d\n", b);      // flag as negative if number is negative 
        
        
        // Precesion of a floating number
       System.out.printf("%f\n", num);        // it's nearly .45
       System.out.printf("%06.2f\n", num);        // total at 6 palces and after decimal I want to show only 2 places that is mention here.
    
       
       // Precession and width for String ( left align and right align)
       String name = "Hello Learner!";
       System.out.printf("%20s\n", name);        // It will print the String including total width 20
       System.out.printf("%-20s\n", name);        // String is left align
       
       // format also made the same
       System.out.format("%-20s\n", name);        // String is left align
       
    
    }
    
}
