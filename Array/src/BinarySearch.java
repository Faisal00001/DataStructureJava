public class BinarySearch {
    public void BinarySearchImplementation(int []Arr, int val,int high,int low){
        int mid;
        mid=(high+low)/2;
        if(low<=high){
            if(val==Arr[mid]){
                System.out.println("Elements found ");
            }
            if(val>Arr[mid]){
                low=mid+1;
                BinarySearchImplementation(Arr,val,high,low);
            }
            if(val<Arr[mid]){
                high=mid-1;
                BinarySearchImplementation(Arr,val,high,low);
            }

        }
        else {
            System.out.println("Elements not found in array");
        }

    }
}
