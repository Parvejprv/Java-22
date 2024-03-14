
package pkg10.methods;


public class Test2 {
    
    // #1 Method with a return type of integer
    /*
    static int max(int x, int y){
        if(x>y)
            return x;
        else 
            return y;
    }
    */
    
    
    // #2 Method with no return type
//    static void max(int x, int y){
//        if(x>y)
//            System.out.println(x);
//        else 
//            System.out.println(y);
//    }
    
    
    // #3  How may we call a method using an object of an class
    int max(int x, int y){
        if(x>y)
            return x;
        else
            return y;
    }
    
    
    public static void main(String[] args) {
        int a = 10, b = 15;
        
        // #1
//        System.out.println("maximum:" + max(a,b));
//        int c = max(a,b);       // actual parameter
//        System.out.println("maximum:" + c);




        // #2
//        max(a,b);       


        // #3  First create an object of an class and then calling these method also
        Test2 t2 = new Test2();
        System.out.println("maximum is = " + t2.max(a, b));

    }
}
