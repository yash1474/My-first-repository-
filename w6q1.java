class Queue{
    private final static int MAX=1000;
    private int rear;
    private int arr[]=new int[MAX];
    Queue(){
        rear=-1;
    }
    boolean isEmpty(){
        return (rear<0);
    }
    boolean enqueue(int x){
        if(rear>=MAX-1){
            return false;
        }
        arr[++rear]=x;
        return true;
    }
    int dequeue(){
        if(rear<0){
            System.out.println("Queue is empty");
            return -1;
        }
        int x=arr[0];
        for(int i=0;i<=rear-1;i++){
            arr[i]=arr[i+1];
        }
        arr[rear--]=0;
        return x;
    }
    int front(){
        if(rear<0){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[0];
    }
    void display(){
        for(int i=0;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
public class w6q1 {
    public static void main(String[] args) {
        Queue q=new Queue();
        q.enqueue(35);
        q.enqueue(9);
        q.enqueue(31);
        q.enqueue(20);
        q.enqueue(45);
        q.enqueue(12);
        System.out.println("Queue has following elements ");
        q.display();
        System.out.println(q.dequeue()+" is popped from queue");
        System.out.println("Front element in Queue is "+q.front());
        System.out.println("Now elements present in queue are ");
        q.display();
    }
    
}
