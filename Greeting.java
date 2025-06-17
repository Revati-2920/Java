// Take in input from user as his/her name and returns the o/p as Hello <name> , have a good day !! 

import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name :-)  ");
        String a = sc.nextLine();
        System.out.println("Hello " + a + " have a good day !!");

    }
}
