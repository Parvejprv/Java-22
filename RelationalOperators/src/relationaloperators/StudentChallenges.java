
package relationaloperators;

import java.util.Scanner;


public class StudentChallenges {

    /*
    Question 1, Display the name of the day based on the number
    */
    /*
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the day number: ");
        int day = sc.nextInt();
        
        switch(day){
            case 1: System.out.println("Mon");
                break;
            case 2:System.out.println("Tue");
                break;
            case 3: System.out.println("Wed");
                break;
            case 4:System.out.println("Thur");
                break;
            case 5: System.out.println("Fri");
                break;
            case 6:System.out.println("Sat");
                break;
            case 7: System.out.println("Sun");
                break;
            default : System.out.println("Invalid!");
                break;
        }
    }
    */
    
    /*
    Output:-
    -------
    Enter the day number: 
    5
    Fri

    Enter the day number: 
    7
    Sun

    Enter the day number: 
    8
    Invalid!

    */
    
    
    
    
    
    
    
    
    
    
    
    /*
    Question 2. : Month of the number 
    */
    /*
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Month number(1-12): ");
        int month = sc.nextInt();
        
        switch(month){
            case 1: System.out.println("Jan");
                break;
            case 2:System.out.println("Feb");
                break;
            case 3: System.out.println("Mar");
                break;
            case 4:System.out.println("Apr");
                break;
            case 5: System.out.println("May");
                break;
            case 6:System.out.println("Jun");
                break;
            case 7: System.out.println("Jul");
                break;
            case 8: System.out.println("Aug");
                break;
            case 9:System.out.println("Sep");
                break;
            case 10: System.out.println("Oct");
                break;
            case 11: System.out.println("Nov");
                break;
            case 12: System.out.println("Dec");
                break;
            default : System.out.println("Invalid!");
                break;
        }
    }
    */
    
    /*
    Output:-
    --------
    Enter the Month number(1-12): 
    12
    Dec
    
    Enter the Month number(1-12): 
    8
    Aug
    
    Enter the Month number(1-12): 
    13
    Invalid!
    
    */
    
    
    
    
    
    
    /*
    Question 3. Display type of the website 
    */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the domain name: ");
        String domainName = sc.nextLine();
        
        int lastDotInd = domainName.lastIndexOf(".");
        
        String type = domainName.substring(lastDotInd+1);
//        System.out.println("type:" + type);
        
        switch(type){
            case "com": System.out.println("Commercial");
                break;  
            case "org": System.out.println("Organisation");
                break;  
            case "net": System.out.println("Network");
                break;  
        }
        
    }
    
    
    
    
    
    
    
}



