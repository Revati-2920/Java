
/* Write a program to find out whether a student is pass or fail ; 
if it requires total 40% and at least 30% in each Subject to pass 
Assume 3 subjects and take marks as an input from user*/

import java.util.Scanner;
public class PracticeSet4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Grade of subject 1 : ");
        int sub1 = sc.nextInt();
        System.out.print("Enter Grade of subject 2 : ");
        int sub2 = sc.nextInt();
        System.out.print("Enter Grade of subject 3 : ");
        int sub3 = sc.nextInt();
        float avg = (sub1+sub2+sub3)/3.0f;
        System.out.println("Your overall percentage is " + avg);
        if(avg>=40 && sub1>=33 && sub2>=33 && sub3>=33 ){
            System.out.println("Congratulations ,.......You are Pass !!!!");
        }
        else{
            System.out.println("Sorry ,...You are fail");
        }


        // TAX CALCULATION 

        float tax = 0.0f;
        System.out.println("Enter your Income : ");
        float income = sc.nextFloat();
        if(income<=2.5f){
            tax = tax + 0;
            System.out.println("No tax !!!");
        
        }
        else if(income >2.5f && income <=5.0f ){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income > 0.5f && income <=10.0f){
            tax = tax + 0.05f * (5.0f  - 2.5f);
            tax = tax + 0.2f * ( income - 5.0f);
        }
        else if(income > 10.0f){
             tax = tax + 0.05f * (10.0f  - 5.0f);
            tax = tax + 0.2f * (5.0f - 2.5f);
            tax = tax + 0.3f * (income - 10.0f);
        }

        System.out.println("Your Tax is " + tax);


        // Write a Java program to find out the day of the week given the number [ 1 for Monday...2 for Tuesday.. anand so on....]


        System.out.println("Enter The Number : ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Day is Monday");
                break;

            case 2:
                System.out.println("Day is Tuesday");
                break;

            case 3:
                System.out.println("Day is Wednesday");
                break;

            case 4:
                System.out.println("Day is Thursday");
                break;

            case 5:
                System.out.println("Day is Friday");
                break;

            case 6:
                System.out.println("Day is Saturday");
                break;

            case 7:
                System.out.println("Day is Sunday");
                break;
        
            default:
                System.out.println("You Have Entered a wrong input ");
                break;
        }


        //Write a Java program to find whether the year entered by the user is a leap year or not .

        System.out.println("Enter Year : ");
        int leap = sc.nextInt();
        if((leap%4==0 && leap%100 !=0) || leap%400 == 0){
            System.out.println("The given year is leap year ");
        }
        else{
            System.out.println("The given year is not leap year");
        }

        /* Write a program to find out the type of webrsite from the url
                                    •Com ---> Commertial website
                                    .org ---> organization website
                                    .in  --> Indian welsite */

        

        System.out.println("Enter the URL : ");   
        String url = sc.next();

        if(url.endsWith(".com")){
            System.out.println("It is a Commercial Website");
        }
        else if(url.endsWith(".org")){
            System.out.println("It is a Organizatonal website ");
        }
         else if(url.endsWith(".in")){
            System.out.println("It is a Indian website ");
        }
        else{
            System.out.println("You Have entered In valid input !!");
        }
                





        
    }
}
