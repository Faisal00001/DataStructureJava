public class Sum {
    public int getSum(int [] arr){
        int total=0;
        for(int i=0;i<arr.length;i++){
            total=total+arr[i];
        }
        return total;
    }
}
