import java.util.ArrayList;

public class ArrayList06_SizeAndIsEmpty {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list.size());    // 0
        System.out.println(list.isEmpty()); // true

        list.add(10);
        list.add(20);

        System.out.println(list.size());    // 2
        System.out.println(list.isEmpty()); // false
    }
}
