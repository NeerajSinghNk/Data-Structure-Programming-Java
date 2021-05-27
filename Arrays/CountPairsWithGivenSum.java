/*
Given an array of N integers, and an integer K, 
find the number of pairs of elements in the array whose sum is equal to K
*/ 

public class CountPairsWithGivenSum {
    public static int getPairsCount(int[] arr, int n, int k) {
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] + arr[j] == k){
                    count++;
                }

            }
        }
        return count;
    }

    public static void main(String args[]){
        int[] arr = { 1, 5, 7, -1, 5 };
        int sum = 6;
        int len = arr.length;
        System.out.println("No. of pair "+getPairsCount(arr,len,sum));
    }
}