public class LeftShift {
    public int [] leftShift(int [] arr){
        int val=arr[arr.length-1];
        for(int i=arr.length-1;i>=1;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=val;
        return arr;
    }
}
