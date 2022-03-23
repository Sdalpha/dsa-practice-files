
import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int temp = n;
        int r, sum = 0;
        while(n>0)
        {
            r = n%10;
            sum = sum+(r*r*r);
            n = n /10;
        }
        if(temp == sum)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
    }
}