import java.util.*;
public class ArrayList23_IsEmpty {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.isEmpty());
        list.add(10);
        System.out.println(list.isEmpty());
    }
}