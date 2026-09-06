import java.util.*;
public class ArrayList37_StringArrayToArrayList {
    public static void main(String[] args) {
        String[] arr = {"Java","Python","C++"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
    }
}