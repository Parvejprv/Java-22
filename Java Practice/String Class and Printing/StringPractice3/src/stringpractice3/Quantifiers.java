
package stringpractice3;


public class Quantifiers {

    
    public static void main(String[] args) {
        
        
        // .* (any letter, anything, any number of times)

        String passM1 = "aaaaaabbbbccccccccccm";
        String passM2 = "aaaaaabbbbcccccccccc";
        String passM3 = "aaaaaabccccccccc";
        String passM4 = "aabbcccc";
        String passM5 = "abc";
        String passM6 = "abd";
        
        System.out.println("passM1:" + passM1.matches("[abc]*"));   // false, because it includes the 'm' also that is not valid
        System.out.println("passM2:" + passM2.matches("[abc]*"));   // true, it has repeated number of time with the valid regex
        System.out.println("passM3:" + passM3.matches("[abc]*"));   // true, same it has the valid regex
        System.out.println("passM4:" + passM4.matches("[abc]*"));   // true
        System.out.println("passM5:" + passM5.matches("[abc]*"));   // true
        System.out.println("passM6:" + passM6.matches("[abc]*"));   // false
        
        
        // * (0 or more|multiple time)
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        
        String passwM1 = "aaaaaabbbbccccccccccm";
        String passwM2 = "aaaaaabbbbcccccccccc";
        String passwM3 = "aaaaaabccccccccc";
        String passwM4 = "aabbcccc";
        String passwM5 = "abc";
        String passwM6 = "abd";
        String passwM7 = "apple";
        String passwM8 = "banana";
        String passwM9 = "mercedez";
        String passwM10 = "apple986";
        String passwM11 = "banana123@";
        String passwM12 = "mercedez456 ";
        
        System.out.println("passwM1:" + passwM1.matches("[a-z]*"));   // true, 
        System.out.println("passwM2:" + passwM2.matches("[a-z]*"));   // true,
        System.out.println("passwM3:" + passwM3.matches("[a-z]*"));   // true, 
        System.out.println("passwM4:" + passwM4.matches("[a-z]*"));   // true
        System.out.println("passwM5:" + passwM5.matches("[a-z]*"));   // true
        System.out.println("passwM6:" + passwM6.matches("[a-z]*"));   // true
        System.out.println("passwM7:" + passwM7.matches("[a-z]*"));   // true
        System.out.println("passwM8:" + passwM8.matches("[a-z]*"));   // true
        System.out.println("passwM9:" + passwM9.matches("[a-z]*"));   // true
        System.out.println("passwM10:" + passwM10.matches("[a-z]*"));   // false
        System.out.println("passwM11:" + passwM11.matches("[a-z]*"));   // false
        System.out.println("passwM12:" + passwM12.matches("[a-z]*"));   // false
    
    
    
    
        // + (One or More)
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Quantifiers (+) -->");
        
        
        
        
        
        String plus0 = "";
        System.out.println(plus0.matches("[a-z]+")); // false
        String plus9 = "";
        System.out.println(plus9.matches("[a-z]+")); // false
        String plus = "";
        System.out.println(plus.matches("[a-z]+")); // false
        String plus1 = " ";
        System.out.println(plus1.matches("[a-z]+")); // false
        String plusAt = "@";
        System.out.println(plusAt.matches("[a-z]+")); // false
        String plus2 = "sam";
        System.out.println(plus2.matches("[a-z]+"));  //true
        String plus3 = "m";
        System.out.println(plus3.matches("[a-z]+"));   // true
        String plus4 = "m10";
        System.out.println(plus4.matches("[a-z]+"));   // false
        
    
        
        
        
        // ? (0 or 1 time)
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Quantifiers (?) -->");
        
        
        
        String ques = "m";
        String ques0 = "0";
        String ques01 = "";
        System.out.println(ques.matches("[a-z]?"));   // true
        System.out.println(ques0.matches("[a-z]?"));   // false
        System.out.println(ques01.matches("[a-z]?"));   // true
        
        
        
    
        // X (X times)
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Quantifiers (X) -->");
    
        
        String quesM = "m";
        System.out.println(quesM.matches("[a-z]{3}"));   // false
        String quesX = "mkj";
        System.out.println(quesX.matches("[a-z]{3}"));   //  true
        String ques0X = "0";
        System.out.println(ques0X.matches("[a-z]{5}"));   //  false
        String ques01X = "";
        System.out.println(ques01X.matches("[a-z]{8}"));    // false
        String ques5X = "kkppm";
        System.out.println(ques5X.matches("[a-z]{5}"));   //  true
        
        
        String pa = "abcdefga";
        System.out.println(pa.matches("[a-z]{8}"));   //  true
        
        String ques8X = "Ap123456";
        System.out.println(ques8X.matches("[A-Z][a-z][0-9]{8} ")); // false
        String ques8 = "abcdef12";
        System.out.println(ques8.matches("[a-z][0-9]{8}"));     //false
    
        
        
        
        // range{num, num}
        
        String strPass = "accbaa";
        String strPass8 = "accbaaab";
        System.out.println(strPass.matches("[abc]{3,7}"));      // true
        System.out.println(strPass8.matches("[abc]{3,7}"));     // false
        
        
        
        
        
        
        
        
        // email Id (regex)
        String strGmail = "john@gmail.com";
        
//        System.out.println(strGmail.matches(".*gmail.*"));
        System.out.println(strGmail.matches("\\w*@gmail(.*)"));
        
        
        
        
        
    }
    
}
