/*
Given an array A[ ] of positive integers of size N, where each value represents the number of 
chocolates in a packet. Each packet can have a variable number of chocolates. There are M students,
 the task is to distribute chocolate packets among M students such that :
1. Each student gets exactly one packet.
2. The difference between maximum number of chocolates given to a student and minimum number of 
chocolates given to a student is minimum.

N = 8, M = 5
A = {3, 4, 1, 9, 56, 7, 9, 12}
Output: 6
Explanation: The minimum difference between 
maximum chocolates and minimum chocolates 
is 9 - 3 = 6 by choosing following M packets :
{3, 4, 9, 7, 9}

*/ 

import java.util.*;
public class ChocolateDistributionProblem {
    
    public static long findMinDiff (int [] arr, int n, int m)
    {
       int min_diff = Integer.MAX_VALUE;
        if(m == 0 || n == 0){
            return 0;
        }
        Arrays.sort(arr);
        if(n<m){
            return -1;
        }

        for(int i=0;i+m-1<n;i++){
            int diff = arr[i+m-1] - arr[i];
            if(diff<min_diff){
                min_diff =  diff;
            }
        }

        return min_diff; 
    }

    public static void main(String[] args) {
        int arr[] = {12, 4, 7, 9, 2, 23,
            25, 41, 30, 40, 28,
            42, 30, 44, 48, 43,
           50};
            
        int m = 7;  // Number of students
        
        int n = arr.length;
        System.out.println("Minimum difference is "
                + findMinDiff(arr, n, m));
    }
}