//print the below pattern
//*****
//****
//***
//**
//*

/*public class PracticeSet5 {
    public static void main(String[] args) {
        int n = 4;
        for(int i=n;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}*/

// FIRST FOUR EVEN NO.
//import java.util.Scanner;
//public class PracticeSet5 {
//
//    public static void main(String[] args) {
//        int sum = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the n :-");
//        int n = sc.nextInt();
//        for(int i=0;i<n;i++){
//            sum = sum + (2*i + 1);
//        }
//        System.out.println(sum);
//    }
//}
//

// MULTIPLICATION TABLE IN REVERSE ORDER

/*import java.util.Scanner;

public class PracticeSet5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = sc.nextInt();
        int mul = 1;
        // for(int i=1;i<=10;i++)............for normal order table
        for(int i= 10 ; i>0;i--){
            System.out.println(i*n);
        }

    }
}*/

//FACTORIAL OF GIVEN NUMBER

/*import java.util.Scanner;

public class PracticeSet5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :- ");
        int n = sc.nextInt();
        int fact;
        fact=1;
        for(int i =1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println(fact);
        sc.close();

    }
}*/
public class PracticeSet5 {

    public static void main(String[] args) {
        int sum = 0;
        int n =2;
        for(int i =1;i<=10;i++){
            System.out.println(i*n);
            sum = sum + (i*n);
        }
        System.out.println(sum);
    }
}