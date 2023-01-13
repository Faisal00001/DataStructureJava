public class ReverseArrrayMethod2 {
    public int [] ReverseArray(int [] arr){
        int i,j,temp;
        for(i=0,j=arr.length-1;i<=j;i++,j--){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

        }
        return arr;
    }
}
