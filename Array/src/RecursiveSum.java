public class RecursiveSum {
    public int getSum(int arr[],int numberOfElements){
        if(numberOfElements<0){
            return -1;

        }
        else {
            return getSum(arr,numberOfElements-1)+arr[numberOfElements];
        }

    }
}
