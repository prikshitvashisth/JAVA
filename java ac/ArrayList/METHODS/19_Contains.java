import java.util.*;
public class ArrayList19_Contains {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30));
        System.out.println(list.contains(20));
        System.out.println(list.contains(99));
    }
}