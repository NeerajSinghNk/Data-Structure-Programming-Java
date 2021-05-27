/*
Given an array of positive integers. 
Find the length of the longest sub-sequence such that elements in the subsequence are consecutive 
integers, the consecutive numbers can be in any order.
 
*/ 
import java.util.*;
public class LongestConsecutiveSubsequence {
    // This function will give an TLE go for an efficient approach
    static int findLongestConseqSubseq(int arr[], int N)
	{
        HashSet<Integer>sh = new HashSet<Integer>();
        int ans=0;
        for(int i=0;i<N;i++){
            sh.add(arr[i]);
        }

        for(int i=0;i<N;i++){
            if(!sh.contains(arr[i]-1)){
                int j = arr[i];

                while(sh.contains(j)){
                    j++;
                }

                if(ans<j-arr[i]){
                    ans =  j-arr[i];
                }
            }
        }
        return ans;
	}

    // Efficient Approach for finding longest consecutive sequence
    
    static int LongestConsecutiveSubsequence(int[] arr, int n){
        Arrays.sort(arr);
        int ans = 0, count = 0;
        ArrayList<Integer> ls = new ArrayList<Integer>();
        ls.add(10);

        for(int i=1;i<n;i++){
            if(arr[i] !=arr[i-1]){
                ls.add(arr[i]);
            }
        }

        for(int i=0;i<ls.size();i++){
            if(i>0 && ls.get(i) == ls.get(i-1)+1){
                count++;
            }
            else{
                count = 1;
            }
            ans = Math.max(ans,count);
        }

        return ans;
    }

    public static void main(String args[])
    {
        int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
        int n = arr.length;
        // System.out.println(
        //     "Length of the Longest consecutive subsequence is "
        //     + findLongestConseqSubseq(arr, n))
        System.out.println(
            "Length of the Longest consecutive subsequence is "
            + LongestConsecutiveSubsequence(arr, n));;
    }
}