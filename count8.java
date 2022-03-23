import java.util.Scanner;

public class count8 {
    public static int Count8(int n){
        int count=0;
        if(n==0){
          return 0;
        }
        if(n%10==8){
          if((n/10)%10==8){
          count++;
          System.out.println("pass1");
          return 1+count+Count8(n/10);
        }else{
            count++;
            System.out.println("pass2");
            return count+Count8(n/10);
          }
        }
        return Count8(n/10);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Count8(n));
        sc.close();
    }
}
