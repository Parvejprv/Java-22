
package arrays;
import java.util.Scanner;


public class FindingMaximumElement {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();   // size of the array
        
        int arr[] = new int [n];        // array created in Heap
        
        System.out.println("Input the Element into the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        // Finding the maximum element from the array
        int max = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element = " + max);
        
    }
    
}


/*
Output:-
---------
Enter the size of the array: 
5
Input the Element into the array: 
10 20 50 25 -90
Maximum element = 50


Enter the size of the array: 
5
Input the Element into the array: 
10 20 50 25 -90
Maximum element = 50

Enter the size of the array: 5
Input the Element into the array: 
10 20 30 40 500
Maximum element = 500


*/