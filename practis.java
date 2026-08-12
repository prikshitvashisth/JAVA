import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class practis {
    public static void main(String[] args) {
        String s = "abcdefgBHJ    I";
        s = s.toLowerCase();
        int vowel = 0;
        int consonent = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                System.out.println("this is a vowel: "+ s.charAt(i));
                vowel++;
            } else{
                if(Character.isLetter(s.charAt(i))) {
                    System.out.println("this is a consonent: "+ s.charAt(i));
                    consonent++;
                }
            }
        }
        System.out.println("Total number of vowels = " + vowel);
        System.out.println("Total number of consonants = " + consonent);

    }
}