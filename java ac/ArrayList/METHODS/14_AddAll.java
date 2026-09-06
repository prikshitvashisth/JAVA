import java.util.*;
public class ArrayList14_AddAll {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(10, 20));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(30, 40));
        a.addAll(b);
        System.out.println(a);
    }
}