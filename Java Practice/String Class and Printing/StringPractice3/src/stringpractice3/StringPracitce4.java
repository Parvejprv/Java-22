
package stringpractice3;


public class StringPracitce4 {

    
    public static void main(String[] args) {
        
        String str1 = "JAVA";
        String str2 = "Java";
        
        String str3 = "python";
        String str4 = "python";
        
        System.out.println(str4.equals(str3));      // true (if cases with be also same | equals)
        System.out.println(str1.equals(str2));   // false , because cases is not equals   
        System.out.println(str1.equalsIgnoreCase(str2));   // true , because cases is ignored  
         
        
        int ans1 = str2.compareTo(str3);
        int ans2 =  str3.compareTo(str2);
        System.out.println(ans1);  
        System.out.println(ans2);
    }
    
}
