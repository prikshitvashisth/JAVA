import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        boolean[] seen = new boolean[26];
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (!seen[c - 'a']) {
                result.append(c);
                seen[c - 'a'] = true;
            }
        }
        
        System.out.println(result);
    }
}