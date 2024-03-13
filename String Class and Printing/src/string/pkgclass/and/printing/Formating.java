// Formating 
package string.pkgclass.and.printing;
import java.util.*;

public class Formating {

    
    public static void main(String[] args) {
        int x = 10;
        float y = 125.66f;
        float f = 0.0066f;
        char z = 'A';
        
         String str =  "Java Program";
        
        System.out.printf("Hello %d %f %c World\n %s",x,y,z, str);
        System.out.printf("Hello %e\n", y);       // e^n
        System.out.printf("Hello %e\n", f);       // e^n (in negative)
        
        // Argument index
        System.out.printf("%3$s, %2$f, %1$d", x, y, str);
    }
    
}
