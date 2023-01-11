import java.util.Scanner;

import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [] A=new int[10];
        for(int i=0;i<A.length;i++){
            A[i]=i+1;
        }

        System.out.println("Enter the value");
        int val=input.nextInt();
        SearchLinear(val,A);
    }
    public static void SearchLinear(int val,int[] A){
        int location=0;
        for(int i=0;i<A.length;i++){
            if(A[i]==val)
                location=i;

        }
        System.out.println("Value Found at "+location);
    }
}
