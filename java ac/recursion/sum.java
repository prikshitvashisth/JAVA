package recursion;

public class sum {
    public static int fxn(int n){
        if(n == 1){
            return 1;
        }
        int o = fxn(n-1);
        int m = n + o;

        return m;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fxn(n));
    }
}

