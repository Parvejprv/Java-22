
package arrays;
import java.util.Scanner;


public class RotatingAnArray {

    
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
        Challenges:-  Left Rotated of an integer array
        */
        int temp = arr[0];      // copy the first value of array into the temp variable
        for(int i=1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        
        System.out.println("Array elements after left rotated,");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
