
/*  
Question:-
----------
The bonus in a company is given by Bonus= Salary * (5 / 100). A company decided to give a bonus of 5% to employees if his/her years of service is more than 5 years. Ask user for their salary and year of service and print the net bonus amount. If the years of service is less than or equal to 5, print 0, otherwise print Bonus calculated.

Input Format

For each test case, you will be given Salary of the user in the first line as an integer input. Years of service in the second line as an integer input.

Constraints

0<=salary<=2^20 0<=years of service<=2^20

Output Format

Print the bonus of the employee in the integer format.

Sample Input 0

20000
6
Sample Output 0

1000
Explanation 0

Since the years of service is 6, so we give the bonus. Hence the bonus is 1000.
*/

// package Java-22.Java-DSA Aug 2022.Day 04.misc;

import java.util.Scanner;

public class PrintBonus {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the Salary of an Employee:");
    int salary = sc.nextInt();
    System.out.println("Input the year of services:");
    int yos = sc.nextInt();

    // based on the given  conditions
    if (yos <= 5) {
      System.out.print("No Bonus i.e. bonus = 0");
    } else  if( yos > 5){
      double bonus = (salary * 5)/100;
      salary += bonus;
      System.out.printf("The Bonus amount for this employee is : %d", Math.round(bonus));
    }

    
  }

}



/*  
Output:-
---------
Enter the Salary of an Employee:
20000
Input the year of services:
6
The Bonus amount for this employee is : 1000
*/













/* 

import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int bonus;
        int salary = sc.nextInt();      // salary
        int yos = sc.nextInt();     // year of Services
    
        if(yos > 5){
          bonus = salary*5/100; 
          System.out.println(bonus);
        }else{
            bonus = 0;
            System.out.println(bonus);
        }
    }
} 
*/