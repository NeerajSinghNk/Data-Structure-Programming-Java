/*
Given an array arr of size n and an integer X. 
Find if there's a triplet in the array which sums up to the given integer X.


Example 1:

Input:
n = 6, X = 13
arr[] = [1 4 45 6 10 8]
Output:
1
Explanation:
The triplet {1, 4, 8} in 
the array sums up to 13.
*/ 
import java.util.*;
public class TripletSumInArray {
    // This method will give TLE use Efficient approach
    static boolean tripletSum(int[] arr, int sum){
        // int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;j<arr.length;k++){
                    if(arr[i] + arr[j] + arr[k] == sum){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // Efficient approach
    static boolean tripletSumArray(int[] arr,int sum){
        for(int i=0;i<arr.length-2;i++){
            HashSet<Integer> h = new HashSet<Integer>();
            int cur_sum = sum - arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(h.contains(cur_sum-arr[j])){
                    return true;
                }
                h.add(arr[j]);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int n = 6, X = 100;
        int arr[] = {1, 4, 45, 6, 10, 8,};
        // System.out.println("Triplet Present "+tripletSum(arr,X));
        System.out.println("Triplet Present "+tripletSumArray(arr,X));
    }
}