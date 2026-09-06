import java.util.*;
public class Q05_FindSum {
    // Time O(n), Space O(1).
    public static int sum(ArrayList<Integer> list) {
        int s=0; for(int x:list) s+=x; return s;
    }
    public static void main(String[] args) {
        System.out.println(sum(new ArrayList<>(Arrays.asList(1,2,3,4,5))));
    }
}