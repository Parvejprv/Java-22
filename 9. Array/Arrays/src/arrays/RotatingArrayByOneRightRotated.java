
package arrays;
import java.util.Scanner;


public class RotatingArrayByOneRightRotated {

    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter the size of the array: ");
         int n = sc.nextInt();
         
        int arr[] = new int[n];
        
        System.out.println("Input the elements into the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        /* 
        Challenges:-  right Rotated of an integer array
        */
        int temp = arr[arr.length-1];      // copy the first value of array into the temp variable
        for(int i=arr.length-2; i>=0; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
        
        System.out.println("Array elements after left rotated,");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}




/*
Output:-
---------
Enter the size of the array: 
5
Input the elements into the array: 
10 20 30 40 50
Array elements after left rotated,
50 10 20 30 40


Enter the size of the array: 
5
Input the elements into the array: 
90 80 70 50 10
Array elements after left rotated,
10 90 80 70 50
*/