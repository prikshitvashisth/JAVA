package recursion;

public class remove_Duplicate {
        void removeDuplicates(int[] arr, int n) {
            if (n == 0 || n == 1) {
                return;
            }

            int[] temp = new int[n];
            int j = 0;

            for (int i = 0; i < n - 1; i++) {
                if (arr[i] != arr[i + 1]) {
                    temp[j++] = arr[i];
                }
            }
            temp[j++] = arr[n - 1];

            for (int i = 0; i < j; i++) {
                arr[i] = temp[i];
            }

        }

        public static void main(String[] args) {
            remove_Duplicate obj = new remove_Duplicate();
            int[] arr = {1, 2, 2, 3, 4, 4, 5};
            int n = arr.length;

            obj.removeDuplicates(arr, n);

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
}
