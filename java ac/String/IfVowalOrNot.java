package String;
import java.util.*;
import java.util.Scanner;

public class IfVowalOrNot {
    public static void printVowelAndConsonants(String sentence) {
        int vowel = 0;
        int consonants = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = Character.toLowerCase(sentence.charAt(i));

            if (ch >= 'a' && ch <= 'z') { // Check if it is an alphabet

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println("Vowel: " + ch);
                    vowel++;
                } else {
                    System.out.println("Consonant: " + ch);
                    consonants++;
                }
            }
        }

        System.out.println("\nTotal vowels: " + vowel);
        System.out.println("Total consonants: " + consonants);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        printVowelAndConsonants(sentence);

        sc.close();
    }
}
