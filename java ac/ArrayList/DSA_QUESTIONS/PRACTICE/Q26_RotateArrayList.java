import java.util.*;
public class Q26_RotateArrayList {
    // Collections.rotate() is the direct library method.
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Collections.rotate(a,2);
        System.out.println(a);
    }
}