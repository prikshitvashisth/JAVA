package recursion;

public class Increasing_order {
    public static void fxn(int n){
        if(n == 0){
            System.out.println(n);
            return;
        }
        
        fxn(n-1);
        System.out.println(n);
    }

public static void main(String[] args) {
    int n = 10;
    fxn(n);
}
}

