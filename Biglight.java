import java.util.Scanner;



public class Biglight {
        public static void main(String[] args) {
         
            Scanner sc = new Scanner(System.in);
        int h1, h2, v1, v2;
        h1 = sc.nextInt();
        h2 = sc.nextInt();
        v1 = sc.nextInt();
        v2 = sc.nextInt();
        sc.close();
 while (h1!=h2 && h1<=10000 && h2<=10000)
        {
            h1+=v1;
            h2+=v2;

        }
        if (h1==h2)
        {
            System.out.println("true");
        }
        else 
         System.out.println("false");
        }
}
