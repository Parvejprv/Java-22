
package arrays;
import java.util.Scanner;


public class SearchingAnElement {
    
    
    
    
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];     // creating an array in Heap
        
        System.out.println("Enter the " + n + " elements into the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        // target
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();
        
        // Sum of all the elements of the array elements
        boolean flag = false;
        for(int i=0; i<n; i++){
            if(arr[i] == target){
                  System.out.println("Element Found at :" + i);
                  System.exit(0);
            } 
        }
   
        System.out.println("Element not Found");
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    /*
    //  Search an element present into the array.
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];     // creating an array in Heap
        
        System.out.println("Enter the " + n + " elements into the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        // target
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();
        
        // Sum of all the elements of the array elements
        boolean flag = false;
        for(int i=0; i<n; i++){
            if(arr[i] == target){
                flag = true;
                System.out.println("Found at index " + i);
                break;
    
            } 
        }
   
        if(!flag){
            System.out.println("Element not Found");
        }
        
    }
    
    */
    
    
    
    
}



/*
Output:-
----------
Enter the size of the array: 
5
Enter the 5 elements into the array: 
10 20 30 40 50
Enter the target element: 
50
Found at index 4


Enter the size of the array: 
5
Enter the 5 elements into the array: 
10 20 30 40 50
Enter the target element: 
60
Element not Found


Enter the size of the array: 
5
Enter the 5 elements into the array: 
10 20 30 40 50
Enter the target element: 
11
Element not Found
*/
