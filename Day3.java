// TOPICS COVERED .........


/* Functions , difference between parameters and arguments , 
static and dynamic programming , user friendly like user input codes */

//*********************exploring knowledge of function*************

 /*public class Day3 {
    public static void main(String[] args) {
        int sum = add(3, 2);
        System.out.println(sum);
         int multi = mul(5, 2);
        System.out.println(multi);
    }
    
    public static int add(int a,int b) {
       return a+b ;
    }
    public static int mul(int a,int b) {
       return a*b ;
    }
} */
 
// ***************Function to calculate factorial*****************

/* public class Day3 {
    public static int factorial(int n) {
        int re = 1;
        for(int i = 1; i <= n; i++) {
            re *= i;
        }
        return re;
    }

    public static void main(String[] args) {
        int number = 5; // You can change this value
        int facto = factorial(number); // Function call
        System.out.println("Factorial of " + number + " is: " + facto);
    }
} 
*/

// ********************factorial code with recursion*****************

/*public class Day3 {
    public static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int result;
        result = factorial(5);
        System.out.println("The Factorial of 5 is " + result );
        
    }
}*/


// **********************ARRAYS PRESENTATION***********************


/* "ARRAY" is a collection of elements (values) of the same data type, stored in contiguous memory locations.
 It is used to store multiple values using a single variable name. 
 Accessing Array Elements
 array[0]
 array[1]
 .
 .
 .
 .
 array[n-1]
 Aray indices Stants from O und goes till (n-1) where n is the size of the array

 Array length
Arrays have a length property which gives the length of the array.
array.length = length of array

An Array can be displayd using a for loop :
for (int i=0 ; i<array.length ; i++)
{
system.out.println(array[i]);
}

 */

//  A cinema manager wants to track whether seats are booked (1) or available (0) using an array.

public class Day3 {
    public static void main(String[] args) {
        
        int[] seats = {1, 0, 0, 1, 0, 1, 0, 0, 1, 0};

        System.out.println("Seat Status:");
        for (int i = 0; i <= (seats.length-1); i++) {
            if (seats[i] == 1) {
                System.out.println("Seat " + (i + 1) + ": Booked");
            }
             else {
                System.out.println("Seat " + (i + 1) + ": Available");
            }
        }
    }
}



