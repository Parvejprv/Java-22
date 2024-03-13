
package stringpractice2;
import java.util.*;

public class StringPractice2 {

    
    public static void main(String[] args) {
        
       // Check if it is refereing  to same two object or not,
       String str1 =  "Java"; 
       String str2 =  "Java";
       
       
       System.out.println("Check if these two are holding the same set of reference or not?");
       System.out.println("Yes, " + (str1 == str2));
       
       
       // Check if it is refereing  to same two object or not,
       String str3 =  "Java"; 
       String str4 =  "java";
       
       
       System.out.println("After changing a bit more let, Check if these two are holding the same set of reference or not?");
       System.out.println("No, " + (str3 == str4));
       
       
       
       // Method of a Class
       
       // 1). length() - it will gives length of the string
       int len = str1.length();     // 4
       System.out.println("length(): " + len);
       
       String strLwr = str1.toLowerCase();      // a new object is created inside heap and new instance is pointed to it
       System.out.println("toLowerCase(): " + strLwr);
       
       String strUpr = str1.toUpperCase();      // a new object is created and new instance is pointed to it
       System.out.println("toUpperCase(): " + strUpr);
       
       // trim()
       String welcomeStr = "     WELCOME      ";
       welcomeStr = welcomeStr.trim();
       System.out.println("trim(): " + welcomeStr);
       
       
       //String Substring(int begin);
       String sub = welcomeStr.substring(3);        // COME
       System.out.println("substring(int index):" + sub);
       
       String sub_End = welcomeStr.substring(3,6);      // COM
       System.out.println("substring with ending index (start_index, end_index):" + sub_End);
       
       
       // String repalce(char, char)
       String replaceStr = "Geekey Showz";
       String repl = replaceStr.replace('z', 's');        // COME
       System.out.println("replace():" + repl);
   
       
       //boolean startsWith(String s)
       String site1 = "www.google.com";
       boolean startRes = site1.startsWith("www");
       System.out.println("startsWith(String s): " + startRes);
       
       
       String secureSite = "https:\\www.google.com";
       boolean secRes = secureSite.startsWith("https");
       System.out.println("startsWith(String s): " + secRes);
       

       //boolean endsWith(String s)
       String site2 = "www.oracle.org";
       boolean endRes = site2.endsWith(".org");
       System.out.println("endsWith(String s): " + endRes);
    
       
       
       
       // char charAt(int index)
       String siteM = "www.quoteshot.com";
       char presentChar = siteM.charAt(3);
       System.out.println("charAt(int index): " + presentChar);
       
       // int indexOf(String s)
       String st = "www.quoteshot.com";
       int presentInd = st.indexOf("q");
       System.out.println("indexOf(String s): " + presentInd );
       // int indexOf(String s, int starting_index)
       String sitename = "www.quoteshot.com";
       int presentDot = sitename.indexOf(".", 4);
       System.out.println("indexOf(String s, int starting_index): " + presentDot);
       
       
        
       // int lastIndexOf(String s)
       String st1 = "www.quoteshot.com";
       int lastPresent = st1.lastIndexOf(".");
       System.out.println("lastIndexOf(String s): " + lastPresent );
       
    }
    
}
