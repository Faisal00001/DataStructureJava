public class MergingArray {
    public int [] MarginArray(int [] arr1,int []arr2){
        int i,j,k;
        i=j=k=0;
        int A[]=new int [8];
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                A[k]=arr1[i];
                i++;
                k++;
            }
            else{
                A[k]=arr2[j];
                j++;
                k++;
            }

        }

        for(;i<arr1.length;i++){
                A[k++]=arr1[i];

        }

        for(;j<arr2.length;j++){
                A[k++]=arr1[j];
        }


        return A;
    }

}
