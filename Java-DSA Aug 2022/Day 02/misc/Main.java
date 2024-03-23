import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      // Data Types


      // String 
      // String name = "Samrat";
      // System.out.println(name);

      // // double (big decimal)
      // double percentage = 94.1;
      // System.out.println(percentage);

      // // float (small decimal)
      // float per = 88.9f;
      // System.out.println(per);

      // // boolean
      // boolean answ = false;
      // System.out.println(answ);

      // // character
      // char ch = 'c';
      // System.out.println(ch);

      // Taking Input from user (also include line 1 always)
      // // Scanner sc = new Scanner(System.in);

      //Q1
      // integer input
      // System.out.println("Enter your xx:");
      // int xx = sc.nextInt();  
      // System.out.println("Enter your yy:");
      // int yy = sc.nextInt();
      // System.out.println(xx + yy);

      // float input
      // System.out.println("Enter your abc:");
      // float abc = sc.nextInt();
      // System.out.println(abc);

      // boolean
      // System.out.println("Enter the flag(true/false):");
      // boolean flag = sc.nextBoolean();
      // System.out.println(flag);

      //Q2
      // System.out.println("Enter length:");
      // int length = sc.nextInt();
      // System.out.println("Enter breadth:");
      // int breadth = sc.nextInt();
      // System.out.println("Perimeter" + (2*length+2*breadth));

      //Q3
      // System.out.println("Enter the farenhite:");
      // float fah = sc.nextFloat();
      // System.out.println(((fah-32)*5)/9);

      //Q4
      // System.out.println("Enter the value of aa:");
      // int aa = sc.nextInt();
      // System.out.println("Enter the value of bb:");
      // int bb = sc.nextInt();
      // System.out.println(aa%10+bb%10);



      //// Q5
      // //BODMAS
      // //int/int -> int 
      // //int/float, float/int -> float
      // //float and double behaves identically
      
      // //Print x or y after every line to analyze the output nature
      // int x = 2+3;
      // x = 3+8-29;
      // //x = 4 + 5.2 - 8.3 + 9.2; //Error (Lossy Conversion)
      // double y = 4.1+8.9+3.5;
      // //x = 4*3/8+2.5*2; //Error (Lossy Conversion)
      // y = 22+4*2;
      // y = 8/5 + 13/2;
      // y = 8.0/5 + 13/2;
      // y = 8.0/5 + 13.0/2;
      // x = 392/10%10/2;
      // x = 39%2*3;
      // System.out.println(x);


      

      //Q6
      // System.out.println(22 + 4 * 2);   // 30
      // System.out.println(8/5 + 13/2);   // 1 + 6 = 7
      // System.out.println(8.0/5 + 13/2);   // 7.6

      // System.out.println();
      // double p = 8.0/5;   // 1.6
      // System.out.println(p);
      // double q = 13.0/2;    // 6.5
      // System.out.println(q);
      // System.out.println(p + q);   // 8.1
      


      //print ans after every line to analyze the output nature 
      boolean ans;
      //ans = 5;    // here value get assign but it can't hold 
      // ans = 2+3 > 5;            // false
      // ans = 40 + 5 > 72;        // false
      // ans = 78+93 > 100;        // true
      // ans = 40 + 3 < 50;        // true
      // ans = 90+91 = 81;         // error: unexpected type
      // ans = 5 == 5;             // true
      // ans = 15 == 20;           // false
      // ans = 15 == 3*5;          // true
      // ans = 15 == 6*3;          // false
      //ans = 3!=3;                // false
      //ans = 4!=4;                // false
      // ans = 4!=10;
      // ans = 3*4+8*9 == 45;
      // ans = 2*3 + 4*5 != 5*4 + 7/5;
      // ans = 13/2 == 13.0/2;
      // ans = 15.0/2 +7 == 14.5;

      // System.out.println(ans);


      //Q8
      System.out.println("Enter the num:");
      int num = sc.nextInt();
      System.out.println(num>100);
      
      //Q9
      // System.out.println("Enter the num1:");
      // int num1 = sc.nextInt();
      // System.out.println("Enter the num2:");
      // int num2 = sc.nextInt();
      // System.out.println("Enter the num3:");
      // int num3 = sc.nextInt();
      // System.out.println(num1+num2+num3<150);
      
      //Q10
      System.out.println("Enter the value of xxx:");
      int xxx = sc.nextInt();
      System.out.println("Enter the value of yyy:");
      int yyy = sc.nextInt();
      System.out.println("Enter the value of zzz:");
      int zzz = sc.nextInt();
      System.out.println("Enter the value of www:");
      int www = sc.nextInt();
      System.out.println(xxx*yyy == zzz*www);
      
      //Q11
      System.out.println(num%2==0);


    }
}
