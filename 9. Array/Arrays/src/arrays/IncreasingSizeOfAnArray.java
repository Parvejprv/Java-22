
package arrays;


public class IncreasingSizeOfAnArray {

    
    public static void main(String[] args) {

        int A[] = {8,6,10,9,2};        // an integer array
        
        int lengthOfA = A.length;
        System.out.println("lengthOfA :" + lengthOfA); // Initial length of A[] 
    
        // create another array, having the size is 2*times of array A.
        int B[] = new int[2*lengthOfA];
        System.out.println("B.length :" + B.length);
        
        // Copy the element of the A[] to B[]
        for(int i=0; i<A.length; i++){
            B[i] = A[i];
        }
        A = B;      
        B = null;
        
        System.out.println("");
        System.out.println("length after increasing the size of A[]: " + A.length);      // after increasing the array length A[]
//        System.out.println("B.length:" + B.length);     // null pointer execption error
        
        // Displa the Array element, after increasing the size of A[]
        for(int i=0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();






    }
    
}
