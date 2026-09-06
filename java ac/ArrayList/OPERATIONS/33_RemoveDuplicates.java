import java.util.*;
public class ArrayList33_RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,10,30,20));
        ArrayList<Integer> unique = new ArrayList<>();
        for (int x : list) if (!unique.contains(x)) unique.add(x);
        System.out.println(unique);

        // LinkedHashSet is another common solution:
        System.out.println(new ArrayList<>(new LinkedHashSet<>(list)));
    }
}