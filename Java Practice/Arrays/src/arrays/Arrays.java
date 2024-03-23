
package arrays;
import java.util.Scanner;


public class Arrays {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        /*
            Arrays
        ----------------
        
        Creation of array would be done using the following:-
        =====================================================
        
        1. 
        int arr[] = new int[5];     // {2, 4,6, 8, 10}
        
            System.out.println(A.length);       //length of the array

            How to access the element of an array:-
            A[0] ->  0 indeces element
            A[1] ->  1 indeces element
            A[2] ->  2 indeces element
            A[3] ->  3 indeces element
            A[4] ->  4 indeces element
        
        
            
        
        
        */
        
        
        
        
        
        
        
        int A[] = new int[10];  
        int B[] = {1,2, 3,4,5};
        
        int C[];
        C = new int[10];
        
        // here, Square breacket is just before the name of the array also valid
        int []D = new int[5];       // valid
        int[] E = new int[5];       // valid
        
        
        B[2] = 15;      
        
        // By default array elements initialized with 0.
        for(int i=0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
        
        
        
        // here 2 index value get changed
        for(int i=0; i<B.length; i++){
            System.out.print(B[i] + " ");
        }
        System.out.println();
        
        // printed array element using the for each loop
        for(int x:B){
            System.out.print(x + " ");
        }
        System.out.println();
        
        
        
        
        // taking input through the keyboard
        System.out.println("Input the " + D.length + " elements into the array: ");
        for(int i=0; i<D.length; i++){
            D[i] = sc.nextInt();
            System.out.print(D[i] + " ");
        }
        
        

    }
    
}
