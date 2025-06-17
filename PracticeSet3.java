
import java.util.Scanner;
public class PracticeSet3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write a java program to convert string to lower Case

        System.out.println("Enter a string : ");
        String name = sc.nextLine();
       // System.out.println(name.toLowerCase());

        //Write a Java program to replace spaces with underscores
        //System.out.println(name.toUpperCase());

        //Write a Java program to fill in a leter templte which looks like below: 
        // letter ="Dear </name>, Thanks a lot" Replace </name> with a string (some name)

       // System.out.println("Dear " + name + ", Thanks a lot" );
        String name1 = "Ritesh";
       // System.out.println("Dear " + name.replace(name, name1) + ", Thanks a lot");

        //Write a Java program to detect double and triple spaces in a sting

        String Name =  "  Ritesh    Bhosale";
        System.out.println(Name.indexOf("  "));
        System.out.println(Name.indexOf("   "));






    }
}
