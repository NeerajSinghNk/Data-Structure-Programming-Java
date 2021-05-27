import java.util.*;

public class MedianOfTwoSortedArraysOfDifferentSizes {
    
    static int medianOfTwoSortedArray(int[] arr){
        int n = arr.length;

        if(n%2==0){
            int z = n/2;
            int e = arr[z];
            int q = arr[z-1];

            int ans = (e+q)/2;
            return ans;
        }
        else{
            int z = Math.round(n/2);
            return arr[z];  
        }
    }
    
    public static void main(String[] args) {
        // int[] arr1 = { -5, 3, 6, 12, 15 };
        // int[] arr2 = { -12, -10, -6, -3, 4, 10 };
        int arr1[] = { 1, 12, 15, 26, 38 };
        int arr2[] = { 2, 13, 17, 30, 45 };
        int i = arr1.length;
        int j = arr2.length;
 
        int[] arr3 = new int[i + j];
 
        // Merge two array into one array
        System.arraycopy(arr1, 0, arr3, 0, i);
        System.arraycopy(arr2, 0, arr3, i, j);
 
        // Sort the merged array
        Arrays.sort(arr3);
 
        // calling the method
        System.out.print("Median = " + medianOfTwoSortedArray(arr3));
    }
}