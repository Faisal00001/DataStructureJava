

public class LinkList {
     Node head;
     private static class Node{
         int data;
         Node next;
         Node(int data){
             this.data=data;
             this.next=null;
         }
     }
     LinkList(){
         head=null;
     }
     public void insertAtTail(int data){
         Node n=new Node(data);
         if(head==null){
             head=n;
             return;
         }
         Node p=head;
         while(p.next!=null){
             p=p.next;
         }
         p.next=n;

     }
     public void deleteAtHead(){
          head=head.next;

     }
     public void delete(int val){
         if(head==null){
             return;
         }
         if(head.next==null){
             deleteAtHead();
             return;
         }
         if(head.data==val){
             deleteAtHead();
             return;
         }
         Node temp=head;
         while(temp.next.data!=val){
             temp=temp.next;
         }
         temp.next=temp.next.next;
     }
     public void reverseLinkList(){
         Node previous=null;
         Node current=head;
         while(current!=null){
             previous=current.next;
             current=current.next;
             previous=previous.next;

         } System.out.print("NULL");
         System.out.println();
     }
     public void summation(){
         int sum=0;
         Node p=head;
         while (p!=null){
             sum=sum+ p.data;
             p=p.next;
         }
     }

     public void display(){
         Node temp=head;
         while(temp!=null){
             System.out.print(temp.data+"->");
             temp=temp.next;
         }
         System.out.print("Null");
         System.out.println();
     }

}

