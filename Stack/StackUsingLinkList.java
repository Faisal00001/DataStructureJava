public class StackUsingLinkList {
    private static class Node{
        char data;
        Node next;
        Node(char data){
            this.data=data;
            this.next=null;
        }

    }
    Node top;
    StackUsingLinkList(){
        top=null;
    }
    public boolean isEmpty(){
        return (top==null);
    }
    public boolean isFull(Node n){
        return (n==null);
    }
    public void push(char data){
        Node n=new Node(data);
        Node p=n;
        if(isFull(n)){
            System.out.println("Stack overfollow");
        }
        p.next=top;
        top=p;
    }
    public void pop(){

    }
}
