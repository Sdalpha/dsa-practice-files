
import java.util.Scanner;

public class ClosestDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=(int)Math.floor(Math.sqrt(n+2)) ;i>=1;i--){
            if((n+1)%i==0){
                System.out.println((n+1)/i+" "+i);
            }
            if((n+2)%i==0){
                System.out.println((n+2)/i+" "+i);
            }
        }
    }
}
