package stringpractice3;


public class findingDomainName {

    
    public static void main(String[] args) {
        String str = "programmer@gmail.com";
        
        int i = str.indexOf("@");
        String uname = str.substring(0, i);
        String domain = str.substring(i+1, str.length());
        
        System.out.println("username:" + uname);
        System.out.println("domain = " + domain);
        
        int j = domain.indexOf(".");
        String name =  domain.substring(0, j);
        System.out.println(name.equals("gmail"));
        
//        Or
//        System.out.println(domain.startsWith("gmail"));
    
    
    
    }
    
}
