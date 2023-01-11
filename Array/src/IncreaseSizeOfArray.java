public class IncreaseSizeOfArray {
    public static void main(String[] args){
        int []A={1,2,4,54,5};
        int B[]= new int[10];
        for(int i=0;i<A.length;i++){
            B[i]=A[i];
        }
        A=B;
        B=null;
        System.out.println(A[9]);


    }
}
