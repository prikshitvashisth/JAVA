import java.util.Scanner;

public class PrimeNo {
    
    //Method 1 (Preferable)

    public static boolean isPrime(int n) {
    if (n <= 1) return false;   // Handle numbers ≤1
    if (n == 2) return true;    // 2 is prime

    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false;       // Found a divisor → not prime
        }
    }
    return true;                // No divisor found → prime
}


//Method 2
    public static boolean isPrimeNum(int n) {
    if (n <= 1) return false;   // Handle numbers ≤1
    if (n == 2) return true;    // 2 is prime

    for (int i = 2; i <= (n/2); i++) {
        if (n % i == 0) {
            return false;       
        }
    }
    return true;                
}


//Method 3 
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
