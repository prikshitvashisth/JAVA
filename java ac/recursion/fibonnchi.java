package recursion;

public class fibonnchi {
    public static int fxn(int n) {
        if (n == 0 || n == 1){
            return n;
        } 

        int fnm1 = fxn(n - 1);
        int fnm2 = fxn(n - 2);

        return fnm1 + fnm2;

    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(fxn(n));
    }
}
