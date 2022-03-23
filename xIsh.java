// import java.io.*;
import java.util.*;
public class xIsh {
    public static boolean check(String s, String t, int idx){
        if(idx < 0)
            return true;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == t.charAt(idx)){
                return (check(s, t, idx - 1));
            }
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        String x = input.next();
        if(check(word, x, x.length() - 1)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        input.close();
    }
}