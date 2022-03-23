
import java.util.Scanner;

class FloorOfX {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int ans = 0;

        if (arr[0] > k || arr[n - 1] < k) {
            ans = -1;
        } else {
            int i = 0;
            while (arr[i] < k) {
                ans = i;
                i++;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
