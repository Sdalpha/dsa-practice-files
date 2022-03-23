
class Stack{
    int stack[] = new int[3];
    int top = 0;
    
    public void push(int data){
        stack[top] = data; 
        top++;
    }

    public void show(){
        for(int n : stack){
            System.err.print(n+" ");
        }System.out.println("");
    }
    public int pop(){
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
        return data;
    }
}


public class StakArray {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(15);
        s.push(4);
        s.push(87);
        s.pop();
        s.show();
    }
}
