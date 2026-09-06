import java.util.*;
public class Q18_Intersection {
    // For sorted lists: two pointers O(n+m). This version handles sorted input.
    public static ArrayList<Integer> intersection(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0,j=0;
        while(i<a.size() && j<b.size()) {
            if(a.get(i).equals(b.get(j))) { ans.add(a.get(i)); i++; j++; }
            else if(a.get(i)<b.get(j)) i++; else j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(intersection(new ArrayList<>(Arrays.asList(1,2,3,4)),
                                        new ArrayList<>(Arrays.asList(2,4,6))));
    }
}