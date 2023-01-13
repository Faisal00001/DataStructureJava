public class ReverseAnArray {
    public int [] ReverseArray(int [] A){
        int [] B=new int [A.length];
        int i,j,k;
        for(i=A.length-1,j=0;i>=0;i--,j++){
            B[j]=A[i];

        }
        for(k=0;k<B.length;k++){
            A[k]=B[k];
        }
        return A;
    }
}
