import java.util.Scanner;
import java.lang.Thread;
import java.lang.*;
import java.util.concurrent.*;

public class DisplayShowArr {
    private Scanner input =new Scanner(System.in);
    public int [] displaySlowInCircular(int [] arr) {
        //System.out.println("Enter any number to go or 0 to stop");
        //int num=input.nextInt();
        int val;

        while(true){
            val=arr[0];
            for(int i=0;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=val;
            for(int i=0;i<arr.length;i++){
                try {
                    System.out.print(" "+arr[i]);
                    Thread.sleep(1000); // 10000ms = 10s
                } catch(InterruptedException ex){

                    System.exit(0);
                }

            }
            System.out.print("  ");

        }

    }
}
