import java.util.*;
public class ArrayList42_ArrayListGenerics {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();

        ints.add(10);
        strings.add("Java");

        // Generics provide type safety.
        System.out.println(ints);
        System.out.println(strings);
    }
}