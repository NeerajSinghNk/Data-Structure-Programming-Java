/*
Given an array arr[] of N non-negative integers representing the height of blocks.
 If width of each block is 1, compute how much water can be trapped between the blocks during the
  rainy season. 
  Example 1:

Input:
N = 6
arr[] = {3,0,0,2,0,4}
Output:
10

*/ 

public class TrappingRainWater {
    static int trappingWater(int[] arr,int n){
        int ans = 0;
        int[] left = new  int[n];
        int[] right = new int[n];
        left[0] = arr[0];

        for(int i=1;i<n;i++){
            left[i] = Math.max(left[i-1],arr[i]);
        }

        right[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(right[i+1], arr[i]);
        }

        for(int i=0;i<n;i++){
            ans += (Math.min(left[i], right[i])-arr[i]);
        }


        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {6,9,9};
        int n = arr.length;
        System.out.println(trappingWater(arr,n));
        
    }
}