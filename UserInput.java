import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 :");
        int a = sc.nextInt();
        System.out.println("Enter Number 2 : ");
        int b = sc.nextInt();
        int sum = a+b ;
        System.out.println("The Total Sum is :  " + sum);

    }
}
