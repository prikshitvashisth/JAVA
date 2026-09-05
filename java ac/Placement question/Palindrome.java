public class Palindrome {

    public static boolean checkPali(String s) {
        if (s == null) return true;

        // Strip non-alphanumeric characters, then lowercase
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] tests = {
            "abccba",
            "",
            "a",
            "A man, a plan, a canal: Panama",
            "Was it a car or a cat I saw?",
            "hello"
        };
        for (String s : tests) {
            System.out.println("\"" + s + "\" -> " + checkPali(s));
        }
    }
}