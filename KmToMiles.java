// Convert Kilometers to Miles

import java.util.Scanner;
public class KmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Distance in Kilometers (km) :-) ");
        float a = sc.nextFloat();
        double miles = (a*0.621371192);
        System.out.println(miles + " Miles");


        // Detect the number entered is integer or not
        System.out.println("Enter a number : ");
        System.out.println(sc.hasNextInt());

    }
}
