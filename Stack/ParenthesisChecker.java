package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker {
    public static boolean check(char c, Stack<Character> st){
        if(st.peek() == '(' && c == ')'){
            return true;
        }
        if(st.peek() == '{' && c == '}'){
            return true;
        }
        if(st.peek() == '[' && c == ']'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c =='(' || c =='{' || c == '['){
                stack.push(c);
            }else{
                if(stack.empty() || check(c,stack) == false){
                    System.out.println("0");
                    return;
                }else{
                    stack.pop();
                }
            }
        }
        if(stack.empty()==true){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
        sc.close();
    }
}
