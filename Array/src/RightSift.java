public class RightSift {
    public int [] rightShift(int [] arr){
        int index=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=index;
        return arr;
    }
}
