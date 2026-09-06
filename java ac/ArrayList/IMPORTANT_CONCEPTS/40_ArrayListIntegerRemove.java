import java.util.*;
public class ArrayList40_ArrayListIntegerRemove {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30));

        list.remove(1); // removes index 1 -> 20
        System.out.println(list);

        list = new ArrayList<>(Arrays.asList(10,20,30));
        list.remove(Integer.valueOf(20)); // removes value 20
        System.out.println(list);
    }
}