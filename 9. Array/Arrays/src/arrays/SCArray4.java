
package arrays;


public class SCArray4 {

    
    public static void main(String[] args) {
        
        String arr[] = {"java", "python", "pascal", "smalltalk", "ada", "basic", "ruby", "java-script", "cpp"};
        
        java.util.Arrays.sort(arr);     // it got sort
        
        for(String x:arr)
            System.out.println(x);
    }
    
}
