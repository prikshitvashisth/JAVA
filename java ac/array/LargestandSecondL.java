package array;

import java.util.Arrays;

public class LargestandSecondL {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        Arrays.sort(arr);
        int a = arr.length-1;
        System.out.println(arr[a] + " " + arr[a-1]);
    }
}
