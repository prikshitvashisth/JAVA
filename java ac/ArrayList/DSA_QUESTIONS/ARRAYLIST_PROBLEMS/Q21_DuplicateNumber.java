import java.util.*;
public class Q21_DuplicateNumber {
    // General ArrayList approach with HashSet: O(n) average time, O(n) space.
    public static int duplicate(ArrayList<Integer> a) {
        HashSet<Integer> seen=new HashSet<>();
        for(int x:a) if(!seen.add(x)) return x;
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(duplicate(new ArrayList<>(Arrays.asList(1,3,4,2,2))));
    }
}