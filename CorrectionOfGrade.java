
// JAVA PRACTICE SET 2

// Write a java program to Encrypt a grade by adding 8 to it . Decrypt it to show the Correct grade

import java.util.Scanner;

public class CorrectionOfGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char a = sc.next().charAt(0);
        //encrypting
        a = (char)(a+8);
        System.out.println(a);
        //decrypting
        a =(char)(a-8);
        System.out.println("Real Grade is : " + a);



        // USE THE COMPARISON OPERATOR TO FIND OUT WHETHER A GIVEN NUMBER IS GREATER THAN THE USER ENTERED NUMBER OR NOT............
        // given number is 22

        int b = 22;
        System.out.println("Enter a expected number for Checking ");
        int c = sc.nextInt();
        System.out.println(c>b);


        // WRITE THE GIVEN EQUATION IN JAVA PROGRAM

        System.out.print("Enter Final Velocity : ");
        float v = sc.nextFloat();
        System.out.print("Enter initial Velocity : ");
        float u = sc.nextFloat();
        System.out.print("Enter Displacement : ");
        float s = sc.nextFloat();
        System.out.print("Enter Acceleration : ");
        float A = sc.nextFloat();
        System.out.print("Final Result   ");
        float R = ((v*v)-(u*u))/(2*A*s);
        System.out.println(R);

        // Interprete the Result
      
        int x = 7;
        int y = 7*49/7 + 35/7;
        System.out.println(y);

    }
}
