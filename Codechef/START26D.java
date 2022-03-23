package Codechef;

import java.util.Scanner;

public class START26D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int sum = x, max = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] >= 0) {
                    sum += arr[i];
                } else {
                    sum -= Math.abs(arr[i]);
                }
                max = Math.max(sum, max);
            }
            System.out.println(max);
        }
    }
}
