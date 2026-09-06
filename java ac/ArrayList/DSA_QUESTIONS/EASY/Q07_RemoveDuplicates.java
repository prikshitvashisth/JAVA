import java.util.*;
public class Q07_RemoveDuplicates {
    // Preserves first occurrence. Time O(n^2) with contains().
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int x:list) if(!ans.contains(x)) ans.add(x);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new ArrayList<>(Arrays.asList(1,2,2,3,1,4))));
    }
}