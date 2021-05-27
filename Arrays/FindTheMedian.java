// MEdian of sorted array

import java.util.*;
public class FindTheMedian {
    static int findMedian(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        int median = 0; 
        if(n%2==1){
            median = arr[(n+1)/2-1]; // Handle odd case
        }
        else{
            median = (arr[n/2-1] + arr[n/2])/2; // Handle even case
        }
        return median;
    }

    public static void main(String[] args) {
        int arr[] = {90 ,100 ,78 ,89 ,67};
        System.out.println(findMedian(arr));
    }
}