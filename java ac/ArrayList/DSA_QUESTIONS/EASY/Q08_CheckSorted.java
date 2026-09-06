import java.util.*;
public class Q08_CheckSorted {
    // Time O(n), Space O(1).
    public static boolean isSorted(ArrayList<Integer> list) {
        for(int i=1;i<list.size();i++) if(list.get(i)<list.get(i-1)) return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isSorted(new ArrayList<>(Arrays.asList(1,2,2,5))));
    }
}