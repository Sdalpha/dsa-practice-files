import java.util.Scanner;

public class Count7 {
    public static int countSeven(int n){
        int rem=0;
        int count = 0;
        if(n == 0){
            return 0;
        }
            rem = n%10;
            if(rem==7){
                count++;
                return count+countSeven(n/=10);
            }
            return countSeven(n/=10);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countSeven(n));
        sc.close();
    }
}
