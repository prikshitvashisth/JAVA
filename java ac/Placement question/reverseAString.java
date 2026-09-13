import java.util.Scanner;
public class reverseAString {
    public static void main(String[] args){
        String str = "hello";
        String s = new StringBuilder(str).reverse().toString();
        System.out.println(str);
        System.out.println(s);
    
}
}
