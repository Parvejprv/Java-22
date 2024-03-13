
package arrays;

import java.util.Scanner;


public class AddingTwoMatrices {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the row size:");
        int row = sc.nextInt();     // row
        System.out.println("Enter the col size:");
        int col = sc.nextInt();      // column
        
        int arr1[][] = new int[row][col];        // an array1 would get created
        int arr2[][] = new int[row][col];        // an array2 would get created
        int arr3[][] = new int[row][col];        // an array3 would be as resultant array
        
        
        // taking element input into the array1
        System.out.println("Enter the input element into the 1st array of size "+row +"x"+ col+" matrix: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        // taking element input into the array2
        System.out.println("Enter the input element into the 2nd array of size "+row +"x"+ col+" matrix: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        
        
        // sum of the 2 two dimensional array 
        for(int i=0; i<row; i++){
             for(int j=0; j<col; j++){
                 arr3[i][j] = (arr1[i][j] + arr2[i][j]);
             }
         }
         
        
        
        // Display the resultant array
        System.out.println("Resultant array would be:- ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
        
       
    }
    
    
    /*
    Output:-
    --------
    
    Enter the row size:
    3
    Enter the col size:
    3
    Enter the input element into the 1st array of size 3x3 matrix: 
    1 2 3
    2 3 4
    3 4 5
    Enter the input element into the 2nd array of size 3x3 matrix: 
    5 4 3
    4 3 2
    3 2 1
    Resultant array would be:- 
    6 6 6 
    6 6 6 
    6 6 6
    
    */
    
    
    
    
    
    

    /*
    // Adding two matrices statically
    // -------------------------------
    public static void main(String[] args) {
        
         int A[][] = {{3, 5, 9}, {7, 6, 2}, {4, 3, 5}};
         int B[][] = {{1, 5, 2}, {6, 8, 4}, {3, 9, 7}};
         
         int C[][] = new int[3][3];     // resultant matrice
         
         // Adding these 2 two dimensional array A[][] and B[][]
//         System.out.println("Addition of 2D array:-");
         for(int i=0; i<3; i++){
             for(int j=0; j<3; j++){
                 C[i][j] = (A[i][j] + B[i][j]);
             }
         }
         
         
         // Display the resultant matrice
         System.out.println("Display the resultant matrice:-");
         for(int i=0; i<3; i++){
             for(int j=0; j<3; j++){
                 System.out.print(C[i][j] + " ");
             }
             System.out.println();
         }
        
        
    }
    */
}
