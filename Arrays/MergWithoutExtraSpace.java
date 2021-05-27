/*
Given two sorted arrays arr1[] of size N and arr2[] of size M. 
Each array is sorted in non-decreasing order.
 Merge the two arrays into one sorted array in non-decreasing order without using any extra space.
*/
import java.util.*;
public class MergWithoutExtraSpace {
    
    public static void merge(int arr1[], int arr2[], int n, int m) {
        
        int i=n-1,j=0;
        while(i>=0 && j<m){
            if(arr1[i] > arr2[j]){
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
            i--;
            j++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
    }

    public static void main(String ar[]){
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {0, 2, 6, 8, 9};
        int n = arr1.length;
        int m = arr2.length;
        merge(arr1,arr2,n,m);
       
        
    }
}