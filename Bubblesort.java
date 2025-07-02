package Searching;

import java.util.Arrays;

// with every step largest elemnt is in the end and in this we compare adjacent elements
public class Bubblesort {
    public static void bubblesort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }

    }
    public static void main(String[] args){
        int[] arr={3,4,6,83,1,2};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
