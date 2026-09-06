import java.util.ArrayList;

public class ArrayList02_AddElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1, 15);

        System.out.println(list);
        // add(value) -> end
        // add(index, value) -> inserts at index and shifts elements right
    }
}
