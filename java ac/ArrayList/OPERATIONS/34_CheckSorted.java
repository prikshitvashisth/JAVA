import java.util.*;
public class ArrayList34_CheckSorted {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,20,30));
        boolean sorted = true;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) {
                sorted = false;
                break;
            }
        }
        System.out.println(sorted);
    }
}