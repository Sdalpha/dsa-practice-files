import java.util.Scanner;

public class NumberOfDay {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                    int m = sc.nextInt();
                    if(m>=1 && m<8)
                    {
                        if(m==2)
                        {
                            System.out.println("28");
                        } else if(m%2!=0)
                        {
                            System.out.println("31");
                        }
                        else{
                            System.out.println("30");
                        }
                    }
                    if(m>=8 && 12<=m)
                    {
                        if(m%2==0)
                        {
                            System.out.println("31");
                        }
                        else{
                            System.out.println("31");
                        }
                    }
                    sc.close();
        }
}
