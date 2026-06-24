package String;

public class DefineString {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = new String("Hello, Java!");
        String str3 = "Hello, World!";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);

        // Comparing strings
        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equals str3: " + str1.equals(str3));
    }
}
