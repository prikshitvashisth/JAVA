package PatternQuestions;

public class squPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows and columns

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for columns
            for (int j = 1; j <= n; j++) {
                System.out.print("*"); // Print the square of the row number
            }
            System.out.print("\n"); // Move to the next line after printing a row
        }
    }
}



// *****
// *****
// *****
// *****
// *****