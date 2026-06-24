package String;
import java.util.Scanner;
public class Input_output_ofString {
    public static void main(String[] args) {


        String inputString;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        inputString = sc.nextLine();

        System.out.println("Input String: " + inputString);

        // Output the length of the string
        int length = inputString.length();
        System.out.println("Length of the string: " + length);

        // Output the character at a specific index
        int index ;
        
        System.out.print("Enter an index to get character: ");
        index = sc.nextInt();
        char charAtIndex = inputString.charAt(index);
        System.out.println("Character at index " + index + ": " + charAtIndex);

        // Output a substring
        String substring = inputString.substring(index, inputString.length());
        System.out.println("Substring from index " + index + " to " + inputString.length() + ": " + substring);
    }
}
