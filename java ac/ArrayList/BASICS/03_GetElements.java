import java.util.ArrayList;

public class ArrayList03_GetElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); list.add(20); list.add(30);

        System.out.println(list.get(0));
        System.out.println(list.get(2));

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index " + i + " = " + list.get(i));
        }
    }
}
