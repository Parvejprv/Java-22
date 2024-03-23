package pkg10.methods;


public class MethodPractice {
    static void change(int arr[], int index, int value){
        arr[index] = value;
    }
    
    static void change2(int x, int value){
        x = value;
    }
    
    public static void main(String[] args) {

        int A[] = {2,4,6,8,10};
        // #1.
        change(A,2,20);
        for(int x:A){
            System.out.print(x + " ");
        }
        
        // #2.
        int x = 10;
        change2(x, 20);
        System.out.println("Value of Primitive "+ x+" ");
    }
    
}


/*
Output:-
---------
2 4 20 8 10
 */