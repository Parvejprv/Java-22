
package pkg10.methods;

import java.util.Scanner;


public class OverloadedMethodToReverseAnIntegerArray {
    // Method to Reverse an integer array
    public static void reverseArray(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            // Swap elements at the start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // Move towards the center
            start++;
            end--;
        }
    }
    
    // Overloaded Method to reverse the elements of the array 
    public static void reverseArray(int arr2[], int start, int end){
        // Check for a valid range
        if(start < 0 || end >= arr2.length || start >=  end){
            System.out.println("Invalid range!");
            return;
        }
        
        while(start < end){
            // Swap elements at the start and end indices
            int temp = arr2[start];
            arr2[start] = arr2[end];
            arr2[end] = temp;
            // Move towards center
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        
         int arr[] = new int[n];
         
         System.out.println("Input the elements into the array: ");
         for(int i=0; i<n; i++){
             arr[i] = sc.nextInt();
         }
         
         
        // Reverse an integer array
        reverseArray(arr);
        
        // diplay the array element after reverse
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +  " ");
        }
        System.out.println("--------------------------------------------------");
        
        // Now again enter the array2 element and perform the array rotation on it
        int arr2[] = new int[n];
         
         System.out.println("Input the elements into the array2: ");
         for(int i=0; i<n; i++){
             arr2[i] = sc.nextInt();
         }
         
         System.out.println("Enter the starting pos:");
         int start = sc.nextInt();
         
         System.out.println("Enter the ending pos:");
         int end = sc.nextInt();
         
         
         // Function call to reverse the array
         reverseArray(arr2, start, end);
         
         // Again array2 printing after reverse
         System.out.println("Array2 elements after reversing it: ");
         for(int i=0; i<n; i++){
             System.out.print(arr2[i] + " ");
         }
        
    }
    
}
