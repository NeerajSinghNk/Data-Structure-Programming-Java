/*
Given an array of integers (A[])  and a number x, find the smallest subarray with sum greater than the 
given value.

Note: The answer always exists. It is guaranteed that x doesn't exceed the summation of a[i]
 (from 1 to N).

Example 1:

Input:
A[] = {1, 4, 45, 6, 0, 19}
x  =  51
Output: 3
Explanation:
Minimum length subarray is 
{4, 45, 6}
*/ 

public class SmallestSubarrayWithSumGreaterThanX {
    static int smallestSubWithSum(int[] arr, int n, int x){
        int min_len = n + 1;

        for (int start = 0; start < n; start++)
        {
            int curr_sum = arr[start];

            if (curr_sum > x)
                return 1;

            // Try different ending points for curremt start
            for (int end = start + 1; end < n; end++)
            {
                // add last element to current sum
                curr_sum += arr[end];

                if (curr_sum > x && (end - start + 1) < min_len)
                    min_len = (end - start + 1);
            }
        }
        return min_len;
    }

    public static void main(String[] args) {
        int A[] = {1, 4, 45, 6, 0, 19};
        int x  =  51;
        int n = A.length;
        System.out.println(smallestSubWithSum(A,n,x));
    }
}