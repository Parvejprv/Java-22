/*  
Question:-
----------
Take the age and salary of a person as an integer input,

If the age is above 40 then

a. If the salary is greater than or equal to 30,000 then print You are rich and adult

b. Else print You are an adult

Else if age is less than or equal to 40

a. If the salary is greater than or equal to 12,000, then print You are rich and young

b. Else print You are young

Input Format

For each test case,

You will get the age of the person in the first line as an integer input,

You will get the salary of the person in the second line as an integer input.

Constraints

0<=age,salary<=2^31-1
Output Format

You have to print the output as a string accordingly.

Sample Input 0

45
35000
Sample Output 0

You are rich and adult
Explanation 0

Since the age is above 40 and the salary is greater than or equal to 30000, so we print "You are rich and adult"

Sample Input 1

35
10000
Sample Output 1

You are young
Explanation 1

Since the age is 30 which is less than or equal to 40 and salary is 10000 which is less than 12000, so we print "You are young"

Sample Input 2

41
30000
Sample Output 2

You are rich and adult
*/
import java.util.*;

public class RichAdultYound {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the age of a person:");
    int age = sc.nextInt();
    System.out.println("Input the Salary of the person:");
    long salary = sc.nextLong();


    if(age > 40){
      if(salary >= 30000)
        System.out.println("You are rich and adult");
        else 
          System.out.println("You are an adult");
    } else if(age <= 40) {
      if(salary >= 12000){
        System.out.println("You are rich and young");
      } else {
        System.out.println("You are young");
      }
    }

  }

}



/*  
Output:-
---------
Enter the age of a person:
35
Input the Salary of the person:
10000
You are young


Enter the age of a person:
45
Input the Salary of the person:
35000 
You are rich and adult

Enter the age of a person:
41
Input the Salary of the person:
30000
You are rich and adult
*/









/*  
Solution:- 2
-------------
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int age = sc.nextInt();
        int salary = sc.nextInt();
        
        if(age>40){
            if(salary>=30000)
            {
                System.out.println("You are rich and adult");
            }
            else{
                System.out.println("You are an adult");
            }
        }
        else if(age<=40){
            if(salary >= 12000)
            {
                System.out.println("You are rich and young");
            }
            else
            {
                System.out.println("You are young");
            }
        }
        
    }
}

*/