import java.util.Scanner;

public class recuSumOFNnumbers {
    static int sum(int[] a, int n) {
        if(n < 0)
            return 0;
        return a[n] + sum(a,n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int j=0;j<n;j++){
                a[j] = sc.nextInt();
            }
            System.out.println("Case "+i+": "+sum(a,n-1));
        }
        sc.close();
    }
}


