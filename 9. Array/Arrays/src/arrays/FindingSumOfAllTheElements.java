
package arrays;
import java.util.Scanner;


public class FindingSumOfAllTheElements {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];     // creating an array in Heap
        
        System.out.println("Enter the " + n + " elements into the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        // Sum of all the elements of the array elements
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        
        System.out.println("Sum = " + sum);
        
        
        
    }
    
}

/*
Output:-
----------
Enter the size of the array: 
5
Enter the 5 elements into the array: 
10 20 30 40 50
Sum = 150


Enter the size of the array: 
5
Enter the 5 elements into the array: 
100 20 30 40 50
Sum = 240


*/

