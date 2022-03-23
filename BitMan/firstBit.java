package BitMan;
import java.io.*;
import java.util.*;
public class firstBit {
    public static int findFirst(int n){
      if(n==0) return 0;
      return (int)(Math.log10(101101));
    }
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      System.out.print(findFirst(n));
    }
}