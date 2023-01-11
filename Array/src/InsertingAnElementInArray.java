import java.util.Scanner;
public class InsertingAnElementInArray {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter Size of Array");
        int n=input.nextInt();
        int []A=new int[n];
        System.out.println("Enter elements in array");
        for(int i=0;i<A.length;i++){
            A[i]=input.nextInt();
        }
      insert(3,4,A);
        print(A);

    }
    public static void insert(int index,int value,int A[]){
        int i;
        if(index>=0 && index<A.length){
            for(i=A.length-1;i>index;i--){
                A[i]=A[i-1];
            }
            A[i]=value;


        }
    }
    public static void print(int A[]){
        System.out.println("Printing numbers");
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }
    }
}
