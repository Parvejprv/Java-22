
package arrays;

import java.util.Scanner;


public class TwoDimentionalArray {

    
    /******************************************
       Method 1. Creating an 2-D Array Statically with initialized value
    *******************************************/
    public static void main(String[] args) {
        
        int arr[][] = {{1,2,3,4}, {2,4,6,8}, {3,5,7,9}};
        
        // Display array elements of the 2D Array, using a for loop
//        System.out.println("Display 2D array: ");
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr[0] .length; i++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        

         // Displaying an integer array using the for-each loop
         System.out.println("Display an integer array using the for-each loop");
         for(int x[] : arr){
             for(int y : x){
                 System.out.print(y + " ");
             }
             System.out.println();
         }

    }
    
    
    
    
    /******************************************
       Method 1. Creating an 2-D Array dynamically
    *******************************************/
    /*
    
    // taking array input dynamically,
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
       
        System.out.println("Enter the row size: ");
        int n = sc.nextInt();
        System.out.println("Enter the column size: ");
        int m = sc.nextInt();
        
        int A[][] = new int[n][m];      // create a 2D array of size nxm
        
        // taking elements input in 2D array of size n*m,
        System.out.println("Enter the elements of "+ n+"X"+m + " size of 2D Array: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                A[i][j] = sc.nextInt();
            }
        }
        
        
        // Display the array elements of the 2D array
        System.out.println("Display the array elements of 2D array:");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    */
    
    
}


/*
Output1:-
--------
Enter the row size: 
3
Enter the column size: 
4
Enter the elements of 3X4 size of 2D Array: 
1 2 3 4
2 4 6 8
3 5 7 9
Display the array elements of 2D array:
1 2 3 4 
2 4 6 8 
3 5 7 9 


Output2:-
Display an integer array using the for-each loop
1 2 3 4 
2 4 6 8 
3 5 7 9
*/
