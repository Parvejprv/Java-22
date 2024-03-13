
package stringpractice3;
import java.util.*;

public class StringPractice3 {

    
    public static void main(String[] args) {

        String str = "Mr. Shahrukh Khan";
        
            System.out.println(str.startsWith("Mr."));
            System.out.println(str.startsWith("Shah"));
            System.out.println(str.startsWith("Shah", 4));
            System.out.println(str.endsWith("Khan"));
        
        
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i));
        }


    }
    
}
