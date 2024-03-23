
package relationaloperators;

import java.util.Scanner;


public class FindTypeOfWebsiteAndProtocolUsed {

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the website name: ");
        String site = sc.nextLine();
        
        int sitLen = site.length();
        
        int colInd = site.indexOf(":");
        int lasIndOfDot = site.lastIndexOf(".");
        
        
        
        String potocol = site.substring(0, colInd);
        String siteType = site.substring(lasIndOfDot+1, sitLen);
        
        
//        System.out.println("potocol:" + potocol);
//        System.out.println("siteType:" + siteType);
        
        if(potocol.equals("http")){
            System.out.println("Hypertext Transfer Protocol");
        } else if(siteType.equals("ftp")){
            System.out.println("File Transfer Protocol");
        }
        
        
        if(siteType.equals("com")){
            System.out.println("Commercial");
        } else if(siteType.equals("org")) {
            System.out.println("Organisation");
        } else if(siteType.equals("net")) {
            System.out.println("Network");
        }

    }
    
    
    /*
    Output:-
    ----------
    Enter the website name: 
    http://www.google.com
    potocol:http
    siteType:com
    Hypertext Transfer Protocol
    Commercial
    */
    
    
    
    
    
    
    
    
    
    
    
    /*
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the website name: ");
        String site = sc.nextLine();
        
        int sitLen = site.length();
        
        int colInd = site.indexOf(":");
        int lasIndOfDot = site.lastIndexOf(".");
        
        
        
        String potocol = site.substring(0, colInd);
        String siteType = site.substring(lasIndOfDot+1, sitLen);
        
        
        System.out.println("potocol:" + potocol);
        System.out.println("siteType:" + siteType);

    }
    */
    
}
