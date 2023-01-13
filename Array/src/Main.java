import java.util.Scanner;

import java.util.*;
public class Main {
    private static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {

       BinarySearch binarySearch=new BinarySearch();
       int [] A=new int [10];
       for(int i=0;i<A.length;i++){
           A[i]=i+1;
       }
       //for(int i=0;i<A.length;i++){
        //   System.out.print(" "+A[i]);
       //}
       int high,low;
       low=0;
       high=A.length-1;
        ///System.out.println();
       //System.out.println("Enter the number");
       //int val=input.nextInt();
       //binarySearch.BinarySearchImplementation(A,val,high,low);
        //BinarySearchArr binarySearchArr=new BinarySearchArr();
        //binarySearchArr.BinarySearch(val,A);
        int B[]=new int [5];

        for(int i=0;i<B.length;i++){
            B[i]=i+1;
        }
       //RecursiveSum recursiveSum=new RecursiveSum();
        //int sum=recursiveSum.getSum(B,9);
        //System.out.println("Print "+sum);
        DisplayShowArr displayShowArr=new DisplayShowArr();
        displayShowArr.displaySlowInCircular(B);
        //B=leftShift.leftShift(B);
        //System.out.println("After");
        //for(int i=0;i<B.length;i++){
           // System.out.println(" "+B[i]);
        //}


    }
}