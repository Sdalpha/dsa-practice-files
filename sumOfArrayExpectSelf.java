import java.util.Scanner;

public class sumOfArrayExpectSelf {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();
                    int sum = 0;
                    int [] arr = new int[n];
                    for(int i=0;i<n;i++)
                    {
                        arr[i] = sc.nextInt();
                        sum += arr[i];
                    }
                    for(int i=0;i<n;i++)
                    {
                        System.out.print(sum - arr[i]);
                        System.out.print(' ');
                    }
                    
                    sc.close(); 
        }
}
