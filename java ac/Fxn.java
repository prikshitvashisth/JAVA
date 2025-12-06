import java.util.*; // Importing the utility package to use Scanner for user input

public class Fxn {

    // This method prints "Hello world", takes two integers as input, and prints their sum
    public static void hello() {
        System.out.println("Hello world"); // Prints a greeting message

        Scanner sc = new Scanner(System.in); // Creates a Scanner object to read input from the user

        int a = sc.nextInt(); // Reads the first integer input from the user
        int b = sc.nextInt(); // Reads the second integer input from the user

        int sum = a + b; // Calculates the sum of the two integers
        System.out.println(sum); // Prints the sum of the two integers
    }   

    // The main method is the entry point of the program
    public static void main(String[] args) {
        hello(); // Calls the hello() method to execute its logic
    }
}  
