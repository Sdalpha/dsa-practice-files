
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class twoSum {
    public static void cal(int[] arr, int t) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(i, arr[i]);
        }
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        int sum = 0;
        int[] result = new int[2];
        while (start < end) {
            sum = arr[start] + arr[end];
            if (sum == t) {
                for (int i = 0; i < arr.length; i++) {
                    if (hm.get(i) == arr[start]) {
                        result[0] = i;
                    }
                    if (hm.get(i) == arr[end]) {
                        result[1] = i;
                    }
                }
                System.out.print(result[0] + " ");
                System.out.print(result[1] + " ");
                return;
            } else if (sum < t) {
                start++;
            } else {
                end--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        cal(arr, t);
        sc.close();
    }
}
