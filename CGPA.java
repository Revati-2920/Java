// Calculate CGPA of three subjects out of 100

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of Subject 1 : ");
        float a = sc.nextFloat();
        System.out.println("Enter Marks of Subject 2 : ");
        float b = sc.nextFloat();
        System.out.println("Enter Marks of Subject 3 : ");
        float c = sc.nextFloat();
        float cgpa = (a+b+c)/30;
        System.out.println("CGPA is : " + cgpa);

    }
}
