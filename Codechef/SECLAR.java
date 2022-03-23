package Codechef;

import java.util.Scanner;

public class SECLAR {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();
                    if(a>b && b>c)
                    {
                        System.out.println(b);
                    }
                    else if(a>c && c>b)
                    {
                        System.out.println(c);
                    }
                    else            //uncomplete*
                    {
                        System.out.println(a);
                    }
                    sc.close(); 
        }
}
