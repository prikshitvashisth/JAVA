import java.util.ArrayList;

public class ArrayList07_ContainsAndIndex {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); list.add(20); list.add(30); list.add(20);

        System.out.println(list.contains(30)); // true
        System.out.println(list.indexOf(20));  // first occurrence
        System.out.println(list.lastIndexOf(20)); // last occurrence
    }
}
