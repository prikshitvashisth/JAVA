package PatternQuestions;
public class Char_Pattern {
    public static void main(String[] args) {
        char ch = 'A'; // Initialize character to 'A'

        // Outer loop for rows
        for (int i = 1; i <= 5; i++) {
            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print(ch); // Print the current character
                ch++; // Increment the character to the next one
            }
            System.out.print("\n"); // Move to the next line after printing a row
        }
    }
}

/*
Output:
A
BC
DEF
GHIJ
KLMNO
*/
