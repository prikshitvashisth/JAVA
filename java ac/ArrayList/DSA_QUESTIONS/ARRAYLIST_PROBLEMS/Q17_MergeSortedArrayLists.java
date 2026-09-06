import java.util.*;
public class Q17_MergeSortedArrayLists {
    // Two pointers: O(n+m) time, O(n+m) output space.
    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0,j=0;
        while(i<a.size() && j<b.size())
            if(a.get(i)<=b.get(j)) ans.add(a.get(i++)); else ans.add(b.get(j++));
        while(i<a.size())ans.add(a.get(i++));
        while(j<b.size())ans.add(b.get(j++));
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(merge(new ArrayList<>(Arrays.asList(1,3,5)),
                                 new ArrayList<>(Arrays.asList(2,4,6))));
    }
}