
import java.util.Arrays;

public class Main {
    public static int[] sortSquare(int[] arr, int n) {
        int res[] = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = arr[i] * arr[i];
        }
        Arrays.sort(res);
        return res;
    }

    public static void printArray(int[] res) {
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {-4, -1, 0, 3, 10};
        int n = arr.length;
        int[] res = sortSquare(arr, n);
        printArray(res);
    }
}
