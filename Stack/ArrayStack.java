
public class ArrayStack {
    private int size;
    private int top;
    private int s[];
    ArrayStack(int size) {
        this.top = -1;
        this.size = size;
        s = new int[size];
    }
    public boolean isFull(){
        return (top==size-1);
    }
    public boolean isEmpty(){
        return (top==-1);
    }
    public void pushElement(int element){
        if(isFull())
            System.out.println("Stack is Full");
        top++;
        s[top]=element;
    }
    public int  popElement(){
        int x=-1;
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        else {
            x=s[top];
            top--;
        }
        return x;
    }
    public int peek(int pos){
        int x=-1;
        if(top-pos+1<0){
            System.out.println("Value is not present");
        }
        else{
            x=s[top-pos+1];
        }
        return x;
    }
    public int stackTop(){
        if(top==-1)
            return -1;
        else
            return s[top];
    }
    public void print(){
        for(int i=top;i>=0;i--){
            System.out.println(" "+s[i]);
        }
    }
}
