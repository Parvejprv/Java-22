package stringpractice3;


public class StudentChallenges {

    
    public static void main(String[] args) {
        
        String str = "programmer@gmail.com";
        
        int indexOfAt = str.indexOf("@");
//        System.out.println("index :" +  indexOfAt);
        String afterAt = str.substring(indexOfAt);
//        System.out.println("afterAt :" +  afterAt);
        int lastIndex = str.lastIndexOf(".");
//        System.out.println("lastIndex :" +  lastIndex);
        String userName = str.substring(0, indexOfAt);
        String domainName = str.substring(lastIndex);
        
        
        System.out.println("userName: " + userName);
        System.out.println("Domain name: " + domainName);
        
        
        
//        System.out.println(str.matches(""));
        
        
        
    }
    
}
