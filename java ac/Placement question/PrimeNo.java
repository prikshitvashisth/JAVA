import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        System.out.print("Enter a number: "); // Prompt the user to enter a number
        int n = sc.nextInt(); // Read the input number

        // Check if the number is less than or equal to 1
        if (n <= 1) {
            System.out.println("Number is not prime."); // Numbers <= 1 are not prime
        } 
        // Check if the number is 2 (the smallest and only even prime number)
        else if (n == 2) {
            System.out.println("Number is prime.");
        } 
        // For numbers greater than 2
        else {
            boolean isPrime = true; // Assume the number is prime initially

            // Loop from 2 to the square root of n
            for (int i = 2; i <= Math.sqrt(n); i++) {
                // If the number is divisible by any i, it's not prime
                if (n % i == 0) {
                    isPrime = false; // Set isPrime to false
                    break; // Exit the loop as we've found a divisor
                }
            }

            // Check the result of the loop
            if (isPrime) {
                System.out.println("Number is prime."); // If no divisors were found, it's prime
            } else {
                System.out.println("Number is not prime."); // If a divisor was found, it's not prime
            }
        }
    }
}
