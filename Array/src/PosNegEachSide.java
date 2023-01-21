public class PosNegEachSide {
    public int [] posNegArray(int [] arr){
        int i=0,j=arr.length-1;
        int temp;
        while(i<j){
            while(arr[i]<0){
                i++;

            }
            while(arr[j]>=0){
                j--;

            }
            if(i<j){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }

        }
        return arr;
    }

}
