public class BinarySearchArr {
    public int BinarySearch(int val,int [] arr){
        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(val==arr[mid]){
                System.out.println("Elements found");
                return mid;
            }
            else if(val>arr[mid]){
                low=mid+1;
            }
            else
                high=mid-1;
        }
        System.out.println("Elements not found");
        return -1;
    }
}
