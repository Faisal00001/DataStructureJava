public class Set {
    public void set(int [] arr,int index,int val){
        arr[index]=val;
        print(arr);

    }
    public void print(int [] arr ){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }

    }
}
