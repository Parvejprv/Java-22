
package stringpractice;
import java.util.*;

public class StringPractice {

    
    public static void main(String[] args) {

        String str1 = "Java Program";
        String str2 = new String("JAVA");
        
        // Using char array
        char charArr[] = {'H','e','l','l','o'};      // character array
        String str3 = new String(charArr);      
        
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        
        // String method param
        String str7 = new String(charArr);
        String str10 = new String(charArr,0, 2);        // (char[], start_index, total_char)
        String str8 = new String(charArr,2, 2);        // (char[], start_index, total_char)
        String str9 = new String(charArr,1, 3);        // (char[], start_index, total_char)
        System.out.println(str7); 
        System.out.println(str8); 
        System.out.println(str9); 
        System.out.println(str10); 
        
        
        // creating a String using a byte array
        byte bArr[] = {65, 66, 67, 68};
        String str4 = new String(bArr);
        String str5 = new String(bArr,2, 2);        // (char[], start_index, total_char)
        String str6 = new String(bArr,1, 2);        // (char[], start_index, total_char)
        System.out.println(str4); 
        System.out.println(str5); 
        System.out.println(str6); 
        
        
        
    }
    
}
