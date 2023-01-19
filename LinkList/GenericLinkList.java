public class GenericLinkList<T> {
    Node<T> head;
    private static class Node<T>{
        T data;
        Node<T> next;
        Node(T data){
            this.data=data;
            this.next=null;
        }
    }
    GenericLinkList(){
        this.head=null;
    }
    public void insertAtTail(T data){
        Node<T> n=new Node<>(data);
        if(head==null){
            head=n;
            return;
        }
        Node<T> p=head;
        while(p.next!=null){
            p=p.next;
        }
        p.next=n;
    }
    public void RecursiveDisplay(Node<T> temp){
       if(temp==null){
           return;
       }

       else{

            RecursiveDisplay(temp.next);
            System.out.print(temp.data+"->");
        }


    }
    public void display(){
        Node<T> temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }
    public int countElement(){
        System.out.println();
        int count=0;
        Node<T> p=head;
        while(p!=null){
            p=p.next;
            count++;

        }
        return count;
    }
    public int recursiveCount(Node<T> head){
        Node<T> p=head;
        if(p==null){
            return 0;
        }
        else{
           return recursiveCount(p.next)+1;
        }
    }
    public Node<T> getHead(){
        return head;
    }
    public void summation(){
        int sum=0;
        int val=0;
        Node p=head;
        while (p!=null){
            val=(Integer)p.data;
            sum=sum+val;
            p=p.next;
        }
        System.out.println("Summation "+sum);
    }

}
