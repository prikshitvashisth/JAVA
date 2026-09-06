import java.util.*;
public class ArrayList18_RemoveAll {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,20));
        ArrayList<Integer> remove = new ArrayList<>(Arrays.asList(20));
        list.removeAll(remove);
        System.out.println(list);
    }
}