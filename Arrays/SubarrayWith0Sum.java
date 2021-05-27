/*
Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.

Example 1:

Input:
5
4 2 -3 1 6

Output: 
Yes

Explanation: 
2, -3, 1 is the subarray 
with sum 0.
*/ 
import java.util.*;
public class SubarrayWith0Sum {
    static boolean findSum(int[] arr, int n){
        Set<Integer>hs = new HashSet<Integer>();
        int sum=0;
        for(int i=0;i<n;i++){
            sum +=arr[i];

            if(arr[i] == 0 || sum == 0 || hs.contains(sum)){
                return true;
            }
            hs.add(sum);
        }
        return false;
    }

    public static void main(String arga[]){
        int[] arr = {4,2,-3,1,6};
        int n = arr.length;
        System.out.println(findSum(arr,n));
    }
}