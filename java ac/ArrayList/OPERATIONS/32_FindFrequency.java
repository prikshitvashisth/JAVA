import java.util.*;
public class ArrayList32_FindFrequency {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,10,30,10));
        int target = 10, count = 0;
        for (int x : list) if (x == target) count++;
        System.out.println(count);
        System.out.println(Collections.frequency(list, target));
    }
}