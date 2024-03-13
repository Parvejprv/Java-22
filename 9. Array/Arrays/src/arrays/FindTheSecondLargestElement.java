
package arrays;

import java.util.Scanner;


public class FindTheSecondLargestElement {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();   // size of the array
        
        int arr[] = new int [n];        // array created in Heap
        
        System.out.println("Input the Element into the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        // Finding the 2nd maximum element from the array
        int max1 = arr[0];  
        int max2 = arr[0];
        
        for(int i=0; i<n; i++){
            // Check if arr[i] is greater than max1        
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            } else if(arr[i] > max2){
                max2 = arr[i];
            }
        }
        
        System.out.println("Second largest element is " + max2);
        
    }
    
}




/*
Output:-
---------
Enter the size of the array: 8
Input the Element into the array: 
10 20 30 40 50 100 90 120
Second largest element is 100


Enter the size of the array: 
10
Input the Element into the array: 
1 2 3 4 5 6 7 89 98 121
Second largest element is 98
*/