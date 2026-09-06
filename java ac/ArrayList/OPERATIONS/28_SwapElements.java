import java.util.*;
public class ArrayList28_SwapElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30));
        Collections.swap(list, 0, 2);
        System.out.println(list);
    }
}