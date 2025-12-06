import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input binary number as an integer (e.g., 1011)
        System.out.print("Enter a binary number: ");
        int binaryNum = sc.nextInt();

        int decimal = 0;  // To store the decimal result
        int power = 0;    // To track the position of the digit (2^power)

        // Loop through each digit of the binary number
        while (binaryNum > 0) {
            int lastDigit = binaryNum % 10;  // Extract the last digit

            if (lastDigit != 0 && lastDigit != 1) {
                System.out.println("Invalid binary number!");
                return;  // Exit if a digit is not 0 or 1
            }

            decimal += lastDigit * Math.pow(2, power);  // Multiply digit by 2^power and add to decimal
            power++;               // Move to the next higher power of 2
            binaryNum /= 10;       // Remove the last digit
        }

        // Output the decimal equivalent
        System.out.println("Decimal equivalent: " + decimal);
    }
}
