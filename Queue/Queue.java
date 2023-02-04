public class Queue {
    public int front;
    public int rear;
    int [] queue;
    int size;
    Queue(int size){
        this.size=size;
        front=-1;
        rear=-1;
        queue=new int[size];
    }
    public boolean isFull(){
        return (rear==size-1);
    }
    public boolean isEmpty(){
        return (front==rear);
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
        }
        rear++;
        queue[rear]=data;
    }
    public int dequeue(){
        int x=-1;
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return x;
        }
        front++;
        x=queue[front];
        return x;

    }
    public void print(){
        for(int i=front+1;i<=rear;i++){
            System.out.println(" "+queue[i]);
        }
    }
}
