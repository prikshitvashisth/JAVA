package recursion;

public class factorial {
    public static int fxn(int n){
        if (n == 0){
            return 1;
        }
        int o = fxn(n-1);
       int m = n * o;
        return m;
    }

    public static void main(String[] args) {
        int n =5;
         System.out.println(fxn(n));
    }
}
