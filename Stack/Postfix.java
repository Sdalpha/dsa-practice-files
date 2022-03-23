package Stack;
import java.util.*;

public class Postfix {
    boolean isEmpty(){
        return (top == -1) ? true : false ;
    }
    public static int precedence(char operator){
        switch(operator){
            case '*' : 
            case '/' :
                return 2;
            case '+' :
            case '-' : 
                return 1;
            case '^' : 
                return 3;

        }
        return -1;
    }

    public void infoxToPostfix(String exp){
        String result = new String("");
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<exp.length();i++){
            char c = exp.charAt(i);

            if(Character.isAlphabetic(c)){
                result += c;
            } else if(c == '('){
                stack.push(c);
            }else if(c == ')'){
                while(!stack.isEmpty() && stack.peek() !== '('){
                    result += stack.pop();
                }
                stack.pop();
            }else{
                while(!stack.isEmpty() && precedence(stack.peek())){
                    result += stack.pop();
                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty()){
            result += stack.pop();
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        
    }
}
