public class Main {
    public static void main(String[] args) {
        LinkList s1=new LinkList();
        s1.insertAtTail(3);
        s1.insertAtTail(4);
        s1.insertAtTail(5);
        s1.insertAtTail(6);
        s1.display();
        s1.delete(5);
        s1.display();
        s1.delete(3);
        s1.display();
        s1.reverseLinkList();
        s1.display();




    }
}