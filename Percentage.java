// Write a program to calculate the percentage of particular person and take the user input of marks for 5 subjects

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of subject 1 : ");
        int a = sc.nextInt();
        System.out.println("Marks Of Subject 1 is : " + a);
        System.out.println("Enter Marks of subject 2 : ");
        int b = sc.nextInt();
        System.out.println("Marks Of Subject 2 is : " + b);
        System.out.println("Enter Marks of subject 3 : ");
        int c = sc.nextInt();
        System.out.println("Marks Of Subject 3 is : " + c);
        System.out.println("Enter Marks of subject 4 : ");
        int d = sc.nextInt();
        System.out.println("Marks Of Subject 4 is : " + d);
        System.out.println("Enter Marks of subject 5 : ");
        int e = sc.nextInt();
        System.out.println("Marks Of Subject 5 is : " + e);
        int Total = (a+b+c+d+e);
        float percent = (Total / 5);
        System.out.println("Percentage of A Particular Student is : " + percent);
        
    }
    
}
