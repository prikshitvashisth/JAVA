import java.util.*;
public class ArrayList31_FindSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30));
        int sum = 0;
        for (int x : list) sum += x;
        System.out.println(sum);
    }
}