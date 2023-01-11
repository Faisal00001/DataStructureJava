public class DeletingElements {
    int count;
    public void DeleteFromPosition(int value,int [] arr){
        int location;
        count= arr.length;
        for(location=0;location<count;location++){
            if(arr[location]==value){
                break;
            }
        }
        if(count==location){
            System.out.println("Elements is not present in array");

        }
        for(int i=location;i<count-1;i++){
            arr[i]=arr[i+1];
        }
        count--;

    }
    public void print(int a[]){
        for(int i=0;i<count;i++){
            System.out.print(" "+a[i]);
        }
    }
}
