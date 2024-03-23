
/*  
Question:-
-----------
You have to take an integer as input and print True if it is an even number and False otherwise.

Input Format

For each test case, you will be given an integer input.

Constraints

-2^31 <= Integer Input <=2^31 -1

Output Format

true or false accordingly

Sample Input 0

22
Sample Output 0

True
Explanation 0

Since 22 is an even number so we print true.

*/

// package Java-22.Java-DSA Aug 2022.Day 04.misc;
import java.util.*;

public class EventOrNot {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number:");
    int n = sc.nextInt();   

    // check if this number is even or not
    if (n % 2 == 0)
      System.out.println("Number is Even.");
    else 
      System.out.println("Number is Odd.");

  }
}


/*  
Output:-
--------
Enter a number:
67
Number is Odd.


Enter a number:
50
Number is Even.

*/