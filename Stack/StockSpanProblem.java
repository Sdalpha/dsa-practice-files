package Stack;

import java.util.Scanner;
class mStack{
    int[] s ;
    int top = -1;
    Stack(int length){
        s = new int[length];
    }

    void push(int data){
        if(top == s.length-1){
            System.out.println("stack overflow");
            
        }else{
            s[++top] = data;
        }
    }
    int pop(){
        if(top == -1){
            System.out.println("stack Underflow");
            return -1;
        }else{
            int val = s[top];
            top--;
            return val;
        }
    }
    int peek(){
        return s[top];
    }
    boolean isEmpty(){
        return (top == -1) ? true : false ;
    }
}
public class StockSpanProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        
        Stack s = new Stack(n);
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            s.push(sc.nextInt());
        }
        

    }
}
