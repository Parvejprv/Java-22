 
package stringpractice3;

public class StudentChallenges3 {
/*
Challenges 1. If there are any special character replace or remove from the given string, using the regular expression.    
*/
/*
Challenges 2. If there are many speaces or any extra spaces remove from the given string, using the regular expression.    
*/
/*
Challenges 3. Find number of words in a String
*/
    
    public static void main(String[] args) {
        
        String str = "a!B@C#1$2%3";
        
        System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
        
        
        String str2 = "P@Q$R%S^Tu&v*w(x)y-z+00+121=";
        System.out.println(str2.replaceAll("[^A-Za-z0-9]", ""));
        
        
        
        
        
        /*
        Challenge 2. Solution
        */
        String str3 = "abc       de     f   ghi     jk     l m       ";
        
        String removeTraillingSpaces = str3.replaceAll("\\s+", " ").trim();
        
        System.out.println(removeTraillingSpaces);
//        System.out.println(removeTraillingSpaces.trim());
        
        
        
        
        


        // Challenge 3. Count the word in a String
        String str5 = "         Dr.      Avul      Pakir      Janual abdin is      Known as the missile man of india.  ";
        
        str5 = str5.replaceAll("\\s+", " ").trim();
        
        String words[] = str5.split("\\s");

        System.out.println("words: " + words.length);
    
    
    
    
    }
    
}
