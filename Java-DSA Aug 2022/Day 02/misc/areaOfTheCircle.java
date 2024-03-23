// package Java-22.Java-DSA Aug 2022.Day 02.misc;

import java.util.Scanner;

public class areaOfTheCircle {
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    // take the diameter as input
    System.out.println("Enter the diameter of the circle:");
    double d = sc.nextDouble();
    double r = d/2;

    // calculate the area of the circle
    double area = Math.PI*r*r;
    System.out.println("Area of the Circle = " + area);
    
  }
}
