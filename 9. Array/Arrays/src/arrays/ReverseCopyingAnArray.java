
package arrays;
import java.util.Scanner;


public class ReverseCopyingAnArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        
        int A[]= new int[n];
        
        System.out.println("Input the elements into the array: ");
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }
        
        
        // Lets create another array B[] and reverse copying these elements into it,
        int B[] = new int[n];
//        for(int i=A.length-1, j=0; i>=0; i--, j++){
//            B[j] = A[i];
//        }


//        int j = n-1;
//        for(int i=0; i<n; i++){
//            B[i] = A[j];
//            j--;
//        }


        int j = 0;
        for(int i=n-1; i>=0; i--){
            B[i] = A[j];
            j++;
        }


//            Logic to copy the Original array into another array in reverse order,
//        for(int j=0; j<n; j++){
//            B[j] = A[n-j-1];
//        }

        
        
        
        
        
        
        // Display the array elements of A[] Before copying the elements to B[]
        System.out.println("Display the array elements of A[] Before copying the elements to B[]:");
        for(int i=0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println("");
        
        
        // Display the array elements after copying the elements to B[]
        System.out.println("Display the Array B[] with the copying elements:");
        for(int i=0; i<B.length; i++){
            System.out.print(B[i] + " ");
        }
        
        
        
        
    }
    
    
}


/*
Output:-
---------
Enter the size of the array: 
5
Input the elements into the array: 
10 20 30 40 50
Display the array elements of A[] Before copying the elements to B[]:
10 20 30 40 50 
Display the Array B[] with the copying elements:
50 40 30 20 10


Enter the size of the array: 
5
Input the elements into the array: 
10 20 30 40 50
Display the array elements of A[] Before copying the elements to B[]:
10 20 30 40 50 
Display the Array B[] with the copying elements:
50 40 30 20 10



*/