public class exp {
    public static void main(String[] args) {
        int n = 4; // number of rows

        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            // move to next line
            System.out.println();
        }
    }
}
