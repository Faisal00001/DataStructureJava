package TreeUsingBuiltInQueue;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.createTree();
        binaryTree.preorder(binaryTree.getRoot());
    }
}
