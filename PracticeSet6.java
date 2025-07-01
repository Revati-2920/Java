//SUM OF ALL ARRAY ELEMENTS
/*public class PracticeSet6 {
    public static void main(String[] args) {
        float [] array = new float[5];
        array[0]=1.1f;
        array[1]=1.2f;
        array[2]=1.3f;
        array[3]=1.4f;
        array[4]=1.5f;
        float sum;
        sum = 0.0f;
        for(int i = 0;i<array.length;i++){
            System.out.println(array[i]);
            sum = sum + array[i];
        }
        System.out.println(sum);

    }
}*/
// *********************KEY SEARCH IN ARRAY***********************

/*
import java.util.Scanner;

public class PracticeSet6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a key:");
        int key = sc.nextInt();
        int[] array = {0, 1, 2, 3, 4};
        boolean found = false;

        System.out.println("ARRAY:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if (key == array[i]) {
                System.out.println("Key " + key + " found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Key " + key + " not found in array.");
        }
        sc.close();
    }
}
    */

// **************** AVERAGE OF AN ARRAY **********************

/*
public class PracticeSet6 {

    public static void main(String[] args) {
         float [] array = new float[5];
        array[0]=1.1f;
        array[1]=1.2f;
        array[2]=1.3f;
        array[3]=1.4f;
        array[4]=1.5f;
        float sum;
        sum = 0.0f;
        for(int i = 0;i<array.length;i++){
            System.out.println(array[i]);
            sum = sum + array[i];
        }
        System.out.println(sum);
        float avg = sum / array.length;
        System.out.println("Average of array is : " + avg);

    }

    }
     */

// ******************************MAXIMUM NUMBER******************************
/* 
public class PracticeSet6 {

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4};
        System.out.println("An ARRAY : ");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        int max = array[0]; // Initialize max to the first element
        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Maximum number in array is: " + max);
    }
}
    */

// ************************MINIMUM NUMBER IN ARRAY*****************************
/*
public class PracticeSet6 {
    public static void main(String[] args) {
        int[] array = {6, 1, 2, 3, 4};
        System.out.println("An ARRAY : ");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        int min = array[0]; // Initialize min to the first element
        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Minimum number in array is: " + min);
    }
}
    */

// *****************************WHETHER AN ARRAY IS SORTED ON NOT**********************
// Give it in sorted order ..............
import java.util.Arrays;

public class PracticeSet6 {
    public static void main(String[] args) {
        int[] array = {6, 1, 2, 3, 4};
        System.out.println("An ARRAY : ");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
       
        boolean isSorted = true;
        for(int i = 0; i < array.length - 1; i++){
            if(array[i] > array[i + 1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is NOT sorted in ascending order.");
            System.out.print("sorted Array is : ");
            Arrays.sort(array);
            for(int i=0;i<array.length;i++){
                System.out.print(" "+array[i]);
            }
        }
    }
}
