/*  
Question:-
-----------
You will get two integer inputs x and y, you need to print “High Sum” if sum is greater than or equal to 100, and print “Low Sum” otherwise.

Input Format

You will get the value of x in the first line, You will get the value of y in the second line.

Constraints

-2^31 <= x,y <= 2^31 -1

Output Format

You need to print "High Sum" or "Low Sum" accordingly.

Sample Input 0

40
70
Sample Output 0

High Sum
Explanation 0

Value of x is 40, value of y is 70. So the sum is 110, since sum is greater than or equal to 100 so we print "High Sum"
*/


// package Java-22.Java-DSA Aug 2022.Day 04.misc;

import java.util.Scanner;

public class LowSumOrHighSum {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value of x:");
    int x = sc.nextInt();
    System.out.println("Enter the value of y:");
    int y = sc.nextInt();

    if((x+y) >= 100){
      System.out.println("High Sum");
    } else {
      System.out.println("Low Sum");
    }
  }
}



/*  
Ouput:-
-------
Enter the value of x:
100
Enter the value of y:
100
High Sum


Enter the value of x:
20
Enter the value of y:
20
Low Sum
*/
