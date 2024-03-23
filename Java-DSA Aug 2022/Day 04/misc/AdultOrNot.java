/* 
Question:-
-----------
You will be given the age of a person as an integer input, you need to print "Adult" if the age is greater than or equal to 18 and print “Below age” if the age is below 18.

Input Format

For each test case, you will get the age of a person as an integer input.

Constraints

0<=age<=1000

Output Format

Print "Adult" or "Below age" accordingly

Sample Input 0

20
Sample Output 0

Adult
Explanation 0

Since the age is 18 which is greater than or equal to 18, and so we print "Adult"
*/



// package Java-22.Java-DSA Aug 2022.Day 04.misc;
import java.util.*;


public class AdultOrNot {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter the age:");
  int age = sc.nextInt(); //age

  if(age >= 18){
    System.out.println("Adult");
  } else {
    System.out.println("Below age");
  }

 } 
}


/* 
Output:-
-----------
Enter the age:
18
Adult

Enter the age:
17
Below age
*/