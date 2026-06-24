package String;

public class LargestString {

    public static void main(String[] args) {
        String[] str1 = {"Hello", "World"};

        String largest = str1[0];
        for (int i = 1; i < str1.length; i++) {
            // Compare strings lexicographically
            if (largest.compareTo(str1[i]) < 0) {
                largest = str1[i];
            }
        }
        System.out.println("The largest string is: " + largest);

    }
}
