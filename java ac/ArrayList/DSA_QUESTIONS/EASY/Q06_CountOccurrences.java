import java.util.*;
public class Q06_CountOccurrences {
    // Time O(n), Space O(1).
    public static int count(ArrayList<Integer> list, int target) {
        int c=0; for(int x:list) if(x==target)c++; return c;
    }
    public static void main(String[] args) {
        System.out.println(count(new ArrayList<>(Arrays.asList(2,3,2,4,2)),2));
    }
}