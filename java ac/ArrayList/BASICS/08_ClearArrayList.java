import java.util.ArrayList;

public class ArrayList08_ClearArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); list.add(20); list.add(30);

        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());
    }
}
