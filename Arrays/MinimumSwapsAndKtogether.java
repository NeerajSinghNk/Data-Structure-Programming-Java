/*
Given an array of n positive integers and a number k. Find the minimum number of swaps required to
 bring all the numbers less than or equal to k together.

Example 1:

â€‹Input : arr[ ] = {2, 1, 5, 6, 3} and K = 3
Output : 1
Explanation:
To bring elements 2, 1, 3 together, swap element '5' with '3'
such that final array will be- arr[] = {2, 1, 3, 6, 5}

*/ 

public class MinimumSwapsAndKtogether {
    
    public static int minSwap (int arr[], int n, int k) {
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i] <= k){
                count++;
            }
        }

        int bad = 0;
        for(int i=0;i<count;i++){
            if(arr[i] > k){
                bad++;
            }
        }

        int ans = bad;

        for(int i=0,j=count;j<n;i++,j++){
            if(arr[i] > k){
                bad--;
            }
            if(arr[j] > k){
                bad++;
            }
            ans = Math.min(ans,bad);
        }

        return ans;

    }

    public static void main(String[] args) {
        int arr[ ] = {2, 1, 5, 6, 3}; 
        int K = 3;
        int n = arr.length;
        System.out.println(minSwap(arr,n,K));
    }
}