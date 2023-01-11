public class Main {
    public static void main(String[] args) {

        DeletingElements deletingElements=new DeletingElements();
        int [] A=new int[10];
        for(int i=0;i<A.length;i++){
            A[i]=i+1;
        }
        deletingElements.DeleteFromPosition(4,A);
        deletingElements.print(A);

    }

}