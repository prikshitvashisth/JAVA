import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input decimal number
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        int originalDecimal = decimal;  // Store original number for final output

        int binary = 0;     // To store the binary result as an integer
        int place = 1;      // To track the position in the binary number (1, 10, 100, ...)

        // Special case when input is 0
        if (decimal == 0) {
            System.out.println("Binary equivalent: 0");
            return;
        }

        // Convert decimal to binary using remainder method
        while (decimal > 0) {
            int remainder = decimal % 2;   // Get remainder (0 or 1)
            binary += remainder * place;   // Add remainder at the correct place (1, 10, 100...)
            place *= 10;                   // Move to next binary place
            decimal /= 2;                  // Divide by 2 for next iteration
        }

        // Output the binary equivalent
        System.out.println("Binary equivalent of " + originalDecimal + " is: " + binary);
    }
}
