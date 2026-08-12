package recursion;

public class Decreasing_order {
    
    
    static void fxn(int n){
        if(n==0){
            return;
        }
        System.out.println(n);

        fxn(n -1);
    }

    public static void main(String[] args){
        int n =5;
        fxn(n);
    }
}
