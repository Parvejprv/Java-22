
package arrays;
import java.util.Scanner;


public class DeletingAnElement {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int A[] = new int[10];
        A[0]=3;A[1]=9;A[2]=7;A[3]=8;A[4]=12;A[5]=6;
        
        int n = 6; 
        for(int i=0; i<n; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println("");
        
        
        // Let suppose, I want to delete the element present at index 1
        int index = 1;
        int temp = A[index];
        for(int i=index; i<n; i++){
            A[i]=A[i+1];
        }
        n = A.length;
        
        // Display the array ,after deleting an element
        System.out.println("Elements after deleted: ");
        for(int i=0; i<n; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println("");
        
    }
    
}



/*
Output:-
---------
3 9 7 8 12 6 
Elements after deleted: 
3 7 8 12 6 0 0 0 0 0 


*/