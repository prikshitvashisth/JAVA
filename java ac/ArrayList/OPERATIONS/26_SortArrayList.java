import java.util.*;
public class ArrayList26_SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(40,10,30,20));
        Collections.sort(list);
        System.out.println(list);
    }
}