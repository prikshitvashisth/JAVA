import java.util.*;
public class Q13_ThreeSum {
    // Sort + two pointers. Time O(n^2), excluding output; Space O(1) extra.
    public static ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> a, int target) {
        Collections.sort(a);
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for(int i=0;i<a.size()-2;i++) {
            if(i>0 && a.get(i).equals(a.get(i-1))) continue;
            int l=i+1,r=a.size()-1;
            while(l<r) {
                int sum=a.get(i)+a.get(l)+a.get(r);
                if(sum==target) {
                    ans.add(new ArrayList<>(Arrays.asList(a.get(i),a.get(l),a.get(r))));
                    int lv=a.get(l),rv=a.get(r);
                    while(l<r && a.get(l)==lv)l++;
                    while(l<r && a.get(r)==rv)r--;
                } else if(sum<target) l++; else r--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(threeSum(new ArrayList<>(Arrays.asList(-1,0,1,2,-1,-4)),0));
    }
}