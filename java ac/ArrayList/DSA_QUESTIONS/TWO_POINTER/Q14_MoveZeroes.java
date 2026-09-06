import java.util.*;
public class Q14_MoveZeroes {
    // Move non-zero values forward, then fill remaining positions with zero.
    // Time O(n), Space O(1).
    public static void moveZeroes(ArrayList<Integer> list) {
        int pos=0;
        for(int i=0;i<list.size();i++) if(list.get(i)!=0) {
            Collections.swap(list,pos,i); pos++;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(0,1,0,3,12));
        moveZeroes(list); System.out.println(list);
    }
}