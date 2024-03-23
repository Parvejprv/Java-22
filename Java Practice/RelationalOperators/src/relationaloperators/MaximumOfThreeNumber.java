
package relationaloperators;
import java.util.*;

public class MaximumOfThreeNumber {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter three number a, b & c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a > b && a > c){
            System.out.println(a);
        } else if(b > c){
            System.out.println(b);
        } else {
            System.out.println(c);
        }
        
    }
    
}
