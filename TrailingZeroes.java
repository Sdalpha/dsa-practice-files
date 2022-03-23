package AccioContest;

import java.util.Scanner;

public class TrailingZeroes {
    public static int tZeros(int n){
       if(n<0){
           return -1;
       }
       int cnt = 0;
       for(int i=5;n/i>=1;i*=5){
           cnt +=n/i;
       }
       return cnt;
    }
        public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
                     int n = sc.nextInt();
                     System.out.println(tZeros(n));
                     sc.close();
        }
}
