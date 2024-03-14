
package pkg10.methods;


    /*
    Methods:-
    ---------
    */

public class Methods {
    
    
    static int max(int x, int y){
        if(x>y)
            return x;
        else 
            return y;
    }
    
    int min(int x, int y){
        if(x<y)
            return x;
        else 
            return y;
    }
    
    public static void main(String[] args) {
        
//        Note:- the method sould be static that is called from an static method
        int a = 10, b = 15;
        System.out.println("maximum: " + max(a,b));
      
        
//        Or It can be called using the an object of the class
        Methods m = new Methods();
        System.out.println("minimum: " + m.min(a,b));
        
        
    }
    
}
