
package pkg10.methods;

import java.util.Scanner;


public class ReverseCopyingAnIntegerArray {
    static void reverseAnArray(int arr[]){
        int n = arr.length;
        int arr2[] = new int[n];
        
        for(int i=n-1, j=0; i>=0; i--,j++){
            arr2[j] = arr[i];
            System.out.print(arr2[j] + " ");
        }
    }

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        System.out.println("Input the elements into the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        // reverseAnArray
        reverseAnArray(arr);
    }
    
}


/*
Output:-
---------
Enter the size: 5
Input the elements into the array: 
10 20 30 40 50
50 40 30 20 10


*/
