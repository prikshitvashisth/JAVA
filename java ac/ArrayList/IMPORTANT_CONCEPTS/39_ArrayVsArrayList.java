import java.util.*;
public class ArrayList39_ArrayVsArrayList {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30));

        System.out.println(arr.length); // fixed size
        System.out.println(list.size()); // dynamic size

        // Array -> primitive/fixed-size; ArrayList -> dynamic and methods like add/remove.
    }
}