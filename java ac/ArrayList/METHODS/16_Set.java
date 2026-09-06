import java.util.*;
public class ArrayList16_Set {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30));
        list.set(1, 99);
        System.out.println(list);
    }
}