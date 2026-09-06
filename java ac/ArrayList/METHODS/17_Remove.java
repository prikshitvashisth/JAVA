import java.util.*;
public class ArrayList17_Remove {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,20));
        list.remove(1); // index
        list.remove(Integer.valueOf(20)); // value
        System.out.println(list);
    }
}