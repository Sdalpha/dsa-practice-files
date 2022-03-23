import java.util.Scanner;

public class Pangrams {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
                boolean[] present = new boolean[26];
                for(int i=0;i<s.length();i++)
                {
                    int c = -1;
                    if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                    {
                        c = s.charAt(i) - 'a';
                    }else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                        c = s.charAt(i) - 'A';
                    }
                    if(c != -1)
                    {
                        present[c] = true;
                    }
                }
                boolean ab = false;
                    for(int i=0;i<26;i++)
                    {
                        if(present[i]==false)
                        {
                            ab = true;
                        }
                    }
                    if(ab == false)
                    {
                        System.out.println("pangram");
                    }
                    else{
                        System.out.println("not pangram");
                    }
                    sc.close();
        }
}


