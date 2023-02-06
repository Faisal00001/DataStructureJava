package Tree;

public class TreeQueue {
    private TreeNode front;
    private TreeNode rear;
    public static class TreeNode{
        Node data;
        TreeNode next;
        TreeNode(Node data){
            this.data=data;
            this.next=null;
        }
    }
    TreeQueue(){
        front=null;
        rear=null;
    }
    public boolean isFull(TreeNode n){
        return (n==null);
    }
    public void enqueue(Node root){
        TreeNode n=new TreeNode(root);
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
    public boolean isEmpty(){
        return (front==null);
    }

    public Node dequeue(){
        Node getNode=null;
        TreeNode temp=front;
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        else{
            getNode=temp.data;
            front=front.next;
            temp.next=null;
        }
        return getNode;


    }
    public TreeNode getFront(){
        return this.front;
    }

}
