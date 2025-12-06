public class InvertedStarPattern {
    public static void main(String[] args) {
        int n = 10; // Number of rows for the pattern

        // Outer loop to iterate over each row
        for (int i = 0; i <= 10; i++) {
            // Inner loop to print stars for each row
            // The number of stars decreases with each row
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*"); // Print a star on the same line
            }
            System.out.print("\n"); // Move to the next line after printing stars for a row
        }
    }
}

/*
Output:
***********
**********
*********
********
*******
******
*****
****
***
**
*
*/
