import java.util.ArrayList;

public class ArrayList05_RemoveElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); list.add(20); list.add(30); list.add(40);

        list.remove(1);                    // removes index 1
        list.remove(Integer.valueOf(30));  // removes value 30

        System.out.println(list);
    }
}
