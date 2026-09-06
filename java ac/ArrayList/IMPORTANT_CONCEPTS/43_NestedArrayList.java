import java.util.*;
public class ArrayList43_NestedArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        matrix.add(new ArrayList<>(Arrays.asList(1,2,3)));
        matrix.add(new ArrayList<>(Arrays.asList(4,5,6)));

        System.out.println(matrix);
        System.out.println(matrix.get(1).get(2)); // 6
    }
}