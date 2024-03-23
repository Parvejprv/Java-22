
package pkg10.methods;

import java.util.Scanner;


public class FindMaximumElementInsideAnIntegerArray {
    static int findMaximum(int arr[]){
        int n = arr.length;
        
        int max = arr[0];
        for(int i=0; i<n; i++)
            if(arr[i] > max)
                max = arr[i];
        
        return max;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the integer array:");
        int n = sc.nextInt();
        
        int arr[] = new int[n];     // create an integer array
        
        System.out.println("Input the elements into the array:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        // function call for finding the max elements into the array
        int maxRes = findMaximum(arr);
        System.out.println("Maximum = " + maxRes);
        
    }
    
}


/*
//Find Maximum into an integer array,

Output:-
---------
Enter the size of the integer array:
5
Input the elements into the array:
20 3 9 101 90
Maximum = 101


*/
