package arrays;
import java.util.Scanner;


public class CopyingAnArray {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        
        int A[]= new int[n];
        
        System.out.println("Input the elements into the array: ");
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }
        
        
        // Lets create another array B[] and copy these elements into it,
        int B[] = new int[A.length];
        for(int i=0; i<B.length; i++){
            B[i] = A[i];
        }
        
        
        
        
        
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
