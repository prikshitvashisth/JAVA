import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        int[] freq = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                char letter = (char) ('a' + i);
                System.out.print(letter + ":" + freq[i] + " ");
            }
        }
    }
}