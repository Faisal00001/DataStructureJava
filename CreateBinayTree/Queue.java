package Tree;

public class Queue {
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node front,rear;
    Node root;
    Queue(){
        this.front=null;
        this.rear=null;
    }
    public boolean isEmpty(){
        return (front==null);
    }
    public boolean isFull(Node n){
        return (n==null);
    }
    public void enqueue(int data){
        Node n=new Node(data);
        if(isFull(n)){
            System.out.println("Queue is Full");
        }
        else{
            if(front==null){
                front=rear=n;
            }
            else{
                rear.next=n;
                rear=n;
            }
        }

    }
    public int dequeue(){
        int x=-1;
        Node temp;
        temp=front;
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        else{
            x=temp.data;
            front=front.next;
            temp.next=null;
        }
        return x;
    }
    public void displayQueue(){
        Node p=front;
        while(p!=null){
            System.out.print(" "+p.data);
            p=p.next;
        }
    }

}
