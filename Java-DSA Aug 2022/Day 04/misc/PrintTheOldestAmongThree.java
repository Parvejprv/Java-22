/*  
Question:-
----------
There are three friends A , B , C. You will be given the ages of these three friends as an integer input, you have to print the same of the oldest friend among them.

Input Format

For each test case, you will be given

Age of A in the first line as an integer input

Age of B in the second line as an integer input

Age of C in the third line as an integer input

Constraints

0<=age<=2^31-1
Output Format

You have print A or B or C accordingly.

Sample Input 0

10
20
30
Sample Output 0

C
Explanation 0

Since C is the oldest among the three friends, so we print C.

Sample Input 1

20
30
5
Sample Output 1

B
Explanation 1

Since B is the oldest among the three, so we print B.
*/



// package Java-22.Java-DSA Aug 2022.Day 04.misc;

import java.util.Scanner;

public class PrintTheOldestAmongThree {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the age of A:");
    int aA = sc.nextInt();

    System.out.println("Enter the age of B:");
    int bB = sc.nextInt();

    System.out.println("Enter the age of C:");
    int cC = sc.nextInt();

    // Method 1. using simple if-else
    // // Find the Oldest among these three
    // if(aA > bB){
    //   if(aA > cC){
    //     System.out.println("A is Oldest..");
    //   } else {
    //     System.out.println("C is Oldest..");
    //   }

    // } else {
    //   if(bB > cC){
    //     System.out.println("B is Oldest.");
    //   } else {
    //     System.out.println("C is Oldest.");
    //   }
    // }

    if(aA > bB && aA > cC){
      System.out.println("A is Oldest.");
    } else if(bB > cC){
      System.out.println( "B is Oldest." );
    } else{
      System.out.println("C is Oldest.");
    }
  
  }
}



/*  
Output:-
--------
Enter the age of A:
10
Enter the age of B:
20
Enter the age of C:
30
C is Oldest.

Enter the age of A:
20 
Enter the age of B:
30
Enter the age of C:
5
B is Oldest.



*/
