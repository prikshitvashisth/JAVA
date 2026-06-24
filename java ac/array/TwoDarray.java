package array;
import java.util.Scanner;

public class Two_D_array{
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        int m = arr[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Second 2D array for comparison
        int[][] arr2 = new int[3][3];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                arr2[i][j] = sc.nextInt();

        // Lexicographic comparison
        int result = 0;
        outer:
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] != arr2[i][j]){
                    result = arr[i][j] < arr2[i][j] ? -1 : 1;
                    break outer;
                }
            }
        }

        if(result == 0) System.out.println("Arrays are lexicographically equal");
        else if(result < 0) System.out.println("arr1 is lexicographically smaller");
        else System.out.println("arr1 is lexicographically greater");
    }
}