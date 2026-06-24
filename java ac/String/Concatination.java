package String;

public class Concatination {
    public static void main(String[] args) {
        String str1 = "Hello, ";
        String str2 = "World!";
        String str3 = str1 + str2; // Concatenation using + operator

        System.out.println("Concatenated String: " + str3);

        // Concatenation using concat() method
        String str4 = str1.concat(str2);
        System.out.println("Concatenated String using concat(): " + str4);
    }
}
