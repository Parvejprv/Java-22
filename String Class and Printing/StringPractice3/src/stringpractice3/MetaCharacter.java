
package stringpractice3;


public class MetaCharacter {
    /*
        // Meta Character
    ---------------------------------
           
        // \d (Digits) - one single digit 0-9
        // \D (not Digits) - not a digit 0-9
        // \s (Space) - Space
        // \S (Not Space) - Not  Space ("")
        // \w (Alphabet or Digit) -  
        // \W (Neither alphabet nor digit) - 
    
    */
    
    public static void main(String[] args) {
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("\\d (Digits) - one single digit 0-9");
        // \d (Digits) - one single digit 0-9
        String str1 = "a";
        System.out.println("str1:" +str1.matches("\\d"));      // false, because it is not a digit
        
        String str0 = "0";
        System.out.println("str0:" + str0.matches("\\d"));      // true, because it is a digit
        String str9 = "9";
        System.out.println("str9:" + str9.matches("\\d"));      // true, because it is a digit
        
        
        
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("\\D (not Digits) - not a digit 0-9");
        // \D (not Digits) - not a digit 0-9
        String str2 = "P";
        System.out.println("str1:" +str1.matches("\\D"));      // true, because it is not a digit
        System.out.println("str2:" +str2.matches("\\D"));      // true, because it is not a digit
        System.out.println("str0:" + str0.matches("\\D"));      // false, because it is a digit
        System.out.println("str9:" + str9.matches("\\D"));      // false, because it is a digit
        


        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("\\\s (Space) - Space ");
        // \s (Space) - Space
        String strSpace = " ";
        System.out.println(strSpace.matches("\\s"));    // true
        String strDoller = "$";
        System.out.println(strDoller.matches("\\s"));   // false
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("\\S (Not Space) - Not Space ");

        // \S (Not Space) - Not  Space ("")
        String strNotSpace = " ";
        System.out.println(strSpace.matches("\\S"));    // false
        System.out.println(strDoller.matches("\\S"));   // true
        System.out.println(strNotSpace.matches("\\S"));     // false
        
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("\\w (Alphabet or Digit) - ");
        // \w (Alphabet or Digit) - 
        //        String str1 = "a";
        String strAt = "@";
        System.out.println(str1.matches("\\w"));      // true
        System.out.println(strAt.matches("\\w"));      // false
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("\\W (Neither alphabet nor digit) - ");
        // \W (Neither alphabet nor digit) - 
        System.out.println(strAt.matches("\\W"));      // true
        System.out.println(str1.matches("\\W"));      // false
        
        
        
        
        
        
        

    }
    
}
