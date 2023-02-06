package Tree;

public class Main {
    public static void main(String [] args){
        Tree t=new Tree();
        t.createTree();
        t.preorder(t.getRoot());
        t.inorder(t.getRoot());
        t.postorder(t.getRoot());
    }
}
