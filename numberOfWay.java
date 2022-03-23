// Number of ways to form Natural Number
// Find number of ways an integer N can be represented as a sum of unique natural numbers.

import java.util.Scanner;

public class numberOfWay {
    public static int count = 0;
    public static int summ(int i,int n){
        if(n==0)
        return 1;
        if(n<i) return 0;

       return summ(i+1,n-i)+summ(i+1,n);
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                System.out.println(summ(1,n));
                sc.close();
    }
}


