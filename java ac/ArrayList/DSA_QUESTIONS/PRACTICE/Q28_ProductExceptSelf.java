import java.util.*;
public class Q28_ProductExceptSelf {
    public static ArrayList<Integer> productExceptSelf(ArrayList<Integer> a) {
        int n=a.size();
        ArrayList<Integer> ans=new ArrayList<>(Collections.nCopies(n,1));
        int prefix=1;
        for(int i=0;i<n;i++){ans.set(i,prefix);prefix*=a.get(i);}
        int suffix=1;
        for(int i=n-1;i>=0;i--){ans.set(i,ans.get(i)*suffix);suffix*=a.get(i);}
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(productExceptSelf(new ArrayList<>(Arrays.asList(1,2,3,4))));
    }
}