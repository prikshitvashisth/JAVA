import java.util.Scanner;

public class Palindrome {
    class PalindromeChecker {
        public boolean isPalindrome(String str) {
            str = str.toLowerCase();
            int left = 0;
            int right = str.length() - 1;
            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = sc.nextLine();
        PalindromeChecker checker = new Palindrome().new PalindromeChecker();
        boolean result = checker.isPalindrome(input);
        if (result) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
        sc.close();
    }
