package TreeUsingBuiltInQueue;

import java.util.LinkedList;
import java.util.Scanner;

import java.util.Queue;

public class BinaryTree {
    Scanner input =new Scanner(System.in);
    Node root;
    BinaryTree(){
        this.root=null;
    }
    public void createTree(){
        Node p;
        Node temp;
        int x;

        System.out.println("Enter the value of root");
        x=input.nextInt();
        root=new Node(x);
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            p=queue.remove();
            System.out.println("Enter the left of "+p.data);
            x=input.nextInt();
            if(x!=-1){
                temp=new Node(x);
                p.left=temp;
                queue.add(temp);
            }
            System.out.println("Enter the right of "+p.data);
            x=input.nextInt();
            if(x!=-1){
                temp=new Node(x);
                p.right=temp;
                queue.add(temp);
            }
        }

    }
    public void preorder(Node root){
        Node p=root;
        if(p!=null){
            System.out.print(" "+p.data);
            preorder(p.left);
            preorder(p.right);
        }
    }
    public Node getRoot(){
        return this.root;
    }

}
