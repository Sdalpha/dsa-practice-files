
class Queue{
    int[] q;
    int count = 0;
    int front = 0;
    int rear = -1;
    Queue(int length){
        q = new int[length];
    }
    
    void enqueue(int data){
        if(q.length == count){
            System.out.println("Queue Overflow!");
            return;
        }
        rear = (rear+1)%q.length;
        q[rear] = data;
        count++;
    }

    int dequeue(){
        if(count==0){
            System.out.println("Queue Underflow");
            return -1;
        }
        int val = q[front];
        front = (front + 1)%q.length;
        count--;
        return val;
    }
}
public class MyQueue {
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.enqueue(5);
        q.enqueue(7);
        q.enqueue(3);
        System.out.println(q.dequeue());
    }
}
