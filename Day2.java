
// operators , instanceof , concatenation , if-else 

public class Day2 {
    public static void main(String[] args) {
        /*int a=8,b=9,c=10,d=3;
        a += 9;
        System.out.println("Modified value of a is : " + a);
        b -= 2;
        System.out.println("Modified value of b is : " + b);
        c *= c*12;
        System.out.println("Modified value of c is : " + c);
        d %= 3;
        System.out.println("Modified value of d is : " + d);
        if(a<b && b>d){
            System.out.println("A is lesser than b and b is greater than d");
        }
        else if(b<c && d<a){
            System.out.println("b is less than c and d is less than a");
        }
        else{
            System.out.println("Invalid ");
        } 

        int a=9,b=8;
        int c,d;
        c = a++;
        d = ++b;
        System.out.println(c);
        System.out.println(d);
        int m1,m2,m3,m4,m5;
        m1=a+b;
        m2=a-b;
        m3=a*b;
        m4=a/b;
        m5=a%b;
        System.out.println("Addition : " + m1);
        System.out.println("Subtraction : " + m2);
        System.out.println("Multiplication : " + m3);
        System.out.println("Division : " + m4);
        System.out.println("Modulus : " + m5); 

        int marks = 89;

        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F (Fail)");
        }

        String firstName = "Revati";
        String lastName = "Bhosale";

       
        String fullName = firstName + " " + lastName;

        System.out.println("Full Name: " + fullName);

        */


        // SWITCH CASE LOOP

        /*   The switch statement in Java is used as an alternative to multiple if-else-if conditions 
        when comparing a single variable to different constant values.


        int day = 3;
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

        

        // FOR LOOP.............

       
        for (int num = 1; num <= 5; num++) {
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + num + " is: " + factorial);
        }

        

        //WHILE LOOP...........
    
        int number = 12321;
        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }

        

        //DO WHILE LOOP..........

        int i = 1;

        do {
            System.out.println("Number: " + i);
            i++;
        } while (i <= 5);

        */
    

      

    }
}
