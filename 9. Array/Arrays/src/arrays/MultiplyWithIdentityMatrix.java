
package arrays;

public class MultiplyWithIdentityMatrix {

    
    /*
    Question- Identity Matrix
    */
    public static void main(String[] args) {
        
         int A[][] = {{3, 5, 9}, {7, 6, 2}, {4, 3, 5}};
         int B[][] = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
         
         
         // here, if col1 is not equals to the row1 then
//         if(A[0].length != B.length){
//             System.out.println("Multiplication cannot be possible because, (col != row1) ");
//             return;
//         }
         
         int C[][] = new int[3][3];     // resultant matrice
         
         // Multiplication of these 2 two dimensional array A[][] and B[][]
//         System.out.println("Addition of 2D array:-");
         for(int i=0; i<3; i++){
             for(int j=0; j<3; j++){
                 for(int k=0; k<3; k++){
                    C[i][j] += (A[i][k] * B[k][j]);
                 }
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
    
}


/*
Output:-
---------

Display the resultant matrice:-
3 5 9 
7 6 2 
4 3 5

Note:- If I multiply any matrix with the identity matrix then the resultant matrix will be always equals to the given matrix.
*/