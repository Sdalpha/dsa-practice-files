package Codechef;

import java.util.Scanner;

public class DIFACTRS {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
                  int n = sc.nextInt();
                  int count=0;
                  for(int i=1;i<=n;i++)
                  {
                      if(n%i==0)
                      count = count + 1;
                      
                    }      
                    System.out.println(count);
                    count = 0;
                    for(int i=1;i<=n;i++){
                    if(n%i==0)
                    {
                        System.out.println(i);
                      }
                    }
                    sc.close();
        }
}
