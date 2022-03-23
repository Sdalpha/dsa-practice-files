import java.util.Scanner;

class Stack{
    int[] s;
    int top = -1;
    Stack(int length){
        s = new int[length];
    }

    void push(int data){
        if(top==s.length-1)
            System.out.println("stack overflow!");
        top++;
        s[top] = data;
    }
    int pop(){
        if(top==-1){
            System.out.println("stack underflow!");
            return -1;
        }
        int val = s[top];
        top--;
        return val;
    }
    int peek(){
        if(top==-1){
            System.out.println("stack underflow!");
            return -1;
        }
        int val = s[top];
        return val;
    }
    void display(){
        if(top==-1){
            System.out.println("stack is empty");
        }else{
            for(int i = top;i>=0;i--){
                System.out.println("|"+s[i]+"|");
            }System.out.println("-----");
        }
    }
}

public class Stackgen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack s = new Stack(n);
        for(int i=0;i<n;i++){
            s.push(sc.nextInt());
        }
        s.display();
        s.pop();
        s.display();
        sc.close();
    }
}
