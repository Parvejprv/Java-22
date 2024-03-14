
package pkg10.methods;

import java.util.Scanner;

/**
 *
 * @Parvej Alam 
 */
public class findTheNameFromEmail {

    static String findName(String email){
        int a = email.indexOf('@');
//        System.out.println("index:" + a);   
        String name = email.substring(0, a);
        
        return name;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the email address:");
        String email = sc.nextLine();
        
        // function call
        String name = findName(email);
        System.out.println("NAME: " + name);
    }
    
}
