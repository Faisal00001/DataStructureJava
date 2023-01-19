public class Main2 {
    public static void main(String[] args) {
        GenericLinkList<Integer> s1=new GenericLinkList<>();
        s1.insertAtTail(1);
        s1.insertAtTail(2);
        s1.insertAtTail(3);
        s1.display();
        System.out.println("Recursive Display");
        s1.RecursiveDisplay(s1.head);
        System.out.println("Count "+s1.countElement());
        System.out.println("Count "+s1.recursiveCount(s1.getHead()));
        s1.summation();
    }
}
