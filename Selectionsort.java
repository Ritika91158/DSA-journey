package Searching;

import java.util.Arrays;

public class Selectionsort {
    public static void selection(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minindex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            int temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;
        }

    }
    public static void main(String[] args){
        int[] arr={7,6,5,87,43,21,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    
}
