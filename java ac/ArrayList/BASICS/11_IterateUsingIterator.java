import java.util.*;

public class ArrayList11_IterateUsingIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40));

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int x = it.next();
            System.out.println(x);
        }

        // Iterator is useful when safely removing while traversing:
        it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == 20) it.remove();
        }
        System.out.println(list);
    }
}
