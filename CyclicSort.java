// ***When given number range from i to n use cyclick sort with formula arr[i] -1 but agr range 0 to n 
// ho toh sirf arr[i] hoga 
// Time Complexity: O(n)
// Space Complexity: O(1)

package Searching;

import java.util.Arrays;

// public class CyclicSort {
//     public static void main(String[] args) {
//         int[] arr = {3,5,2,1,4,8};
//         sort(arr);
//         System.out.println("Array after cyclic sort (partial): " + Arrays.toString(arr));
//     }

//     static void sort(int[] arr) {
//         int i = 0;
//         while (i < arr.length) {
//             int current = arr[i] - 1;

//             // Check if current value is in valid index range and not already in correct position
//             if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[current]) {
//                 // Swap
//                 int temp = arr[i];
//                 arr[i] = arr[current];
//                 arr[current] = temp;
//             } else {
//                 i++;
//             }
//         }
//     }
// }





// MISING NUMBER 

// public class CyclicSort {
//     public static void main(String[] args) {
//         int[] arr = {3,0,1};
//         int missing=missingnumber(arr);
//         System.out.println("Missing number: " +missing);
//     }

//     static int missingnumber(int[] arr) {
//         int i = 0;
//         while (i < arr.length) {
//             int current = arr[i] ;

//             // Check if current value is in valid index range and not already in correct position
//             if (current < arr.length && arr[i] != arr[current]) {
//                 int temp = arr[i];
//                 arr[i] = arr[current];
//                 arr[current] = temp;
//             } else {
//                 i++;
//             }
//         }
//         for(int j=0;j<arr.length;j++){
//             if(arr[j]!=j){
//                 return j;
//             }
//         }
//         return arr.length;
//     }
// }



// 41. First Missing Positive



public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};
        int missing=missingnumber(arr);
        System.out.println("First Missing number: " +missing);
    }

    static int missingnumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int current = arr[i]-1 ;

            // Check if current value is in valid index range and not already in correct position
            if (arr[i]>0 &&arr[i] <= arr.length && arr[i] != arr[current]) {
                int temp = arr[i];
                arr[i] = arr[current];
                arr[current] = temp;
            } else {
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                return j+1;
            }
        }
        return arr.length+1;
    }
}


