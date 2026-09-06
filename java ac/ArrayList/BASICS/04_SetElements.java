import java.util.ArrayList;

public class ArrayList04_SetElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); list.add(20); list.add(30);

        System.out.println(list);
        list.set(1, 200);       // replaces existing element
        System.out.println(list);

        // add() inserts; set() replaces.
    }
}
