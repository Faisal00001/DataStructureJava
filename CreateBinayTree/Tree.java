package Tree;

import java.util.*;
public class Tree {
      Scanner input=new Scanner(System.in);
      Node root;
      Tree(){
            root=null;
      }
      public Node getRoot(){
            return this.root;
      }
      public void createTree(){
            int x;
            Node p;
            Node temp;
            System.out.println("Enter the root value");
            x=input.nextInt();
            root=new Node(x);
            TreeQueue treeQueue=new TreeQueue();
            treeQueue.enqueue(root);
            while(!treeQueue.isEmpty()){
                  p=treeQueue.dequeue();
                  System.out.println("Enter the left child "+p.data);
                  x=input.nextInt();
                  if(x!=-1){
                        temp=new Node(x);
                        p.left=temp;
                        treeQueue.enqueue(temp);
                  }
                  System.out.println("Enter the right child "+p.data);
                  x=input.nextInt();
                  if(x!=-1){
                        temp=new Node(x);
                        p.right=temp;
                        treeQueue.enqueue(temp);
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
      public void inorder(Node root){
            Node p=root;
            if(p!=null){
                  inorder(p.left);
                  System.out.print(" "+p.data);
                  inorder(p.right);
            }

      }
      public void postorder(Node root){
            Node p=root;
            if(p!=null){
                  postorder(p.left);
                  postorder(p.right);
                  System.out.print(" "+p.data);
            }
      }




}
