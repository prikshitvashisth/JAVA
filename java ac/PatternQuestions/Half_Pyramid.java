package PatternQuestions;
public class Half_Pyramid {
    public static void main(String[] args) {
        // Outer loop to handle the rows
        for (int i = 0; i <= 10; i++) {
            // Inner loop to print numbers from 1 to the current row number (i)
            for (int j = 1; j <= i; j++) {
                System.out.print(j); // Print the current value of j on the same line
            }
            System.out.print("\n"); // Move to the next line after printing numbers for a row
        }
    }
}

/*
Output:
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910
*/
