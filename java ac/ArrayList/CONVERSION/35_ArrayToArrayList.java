import java.util.*;
public class ArrayList35_ArrayToArrayList {
    public static void main(String[] args) {
        Integer[] arr = {10,20,30};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);

        // For int[] use a loop/stream because Arrays.asList(int[]) treats it as one object.
    }
}