
package stringpractice3;


public class RegEx {

  
    public static void main(String[] args) {
        
//        String str1 = "f";
//        String str1 = "abc";
        String str1 = "&";
        
        System.out.println(str1.matches(".")); // any character that is matches
        
        
        
        
        // atleast one single letter from the given set of character
        
        String str3 = "ab";     // false
        System.out.println(str3.matches("Regex -> ab" + "[abc]"));    // false
        
        
        String str2 = "a";      
        System.out.println(str1.matches("[abc]"));      // false , because it would comp with str1
        System.out.println(str2.matches("[abc]"));      // true, because this is the character from these
        
        
        
        
        // [a-z0-9]
       String str4 = "0";   
       String str5 = "a";       
       String str6 = "p";     
       String str7 = "9";     
       String str8 = "z";     
       System.out.println(str4.matches("[a-z0-9]"));      // true
       System.out.println(str5.matches("[a-z0-9]"));      // true
       System.out.println(str6.matches("[a-z0-9]"));      // true
       System.out.println(str7.matches("[a-z0-9]"));      // true
       System.out.println(str8.matches("[a-z0-9]"));      // true
       
       
       String str9 = "sk";     
       String str10 = "09";     
       String str11 = "zza0";     
       System.out.println(str9.matches("[a-z0-9]"));      // false
       System.out.println(str10.matches("[a-z0-9]"));      // false
       System.out.println(str11.matches("[a-z0-9]"));      // false 
       
       
       // 
       String str12 = "z0";     
       System.out.println(str12.matches("[a-z][0-9]"));
       
       
       // 
//       String str13 = "b";  // true   
       String str13 = "a";  // true   
//       String str13 = "ba";  // false   
       System.out.println(str13.matches("a|b"));
       
       
       // exact match()
       String str14 = "abc";  
       String str15 = "cba";    
       String str16 = "ba";    
       System.out.println("str14:" + str14.matches("abc"));    // true
       System.out.println("str15:" + str15.matches("abc"));    // false 
       System.out.println("str16:" + str16.matches("abc"));    // false
       
    } 
}
