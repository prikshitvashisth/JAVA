import java.util.*;
public class ArrayList13_Add {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(1, 15);
        System.out.println(list);
    }
}