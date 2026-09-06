import java.util.ArrayList;

public class ArrayList10_IterateUsingForEach {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); list.add(20); list.add(30);

        for (int value : list) {
            System.out.println(value);
        }
    }
}
