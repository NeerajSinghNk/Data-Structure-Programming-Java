/*
Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to check whether a2[] is a 
subset of a1[] or not. Both the arrays can be sorted or unsorted. It may be assumed that elements in
 both array are distinct.
 
*/ 

public class ArraySubsetOfAnotherArray {
    public static boolean isSubset( long arr1[], long arr2[], long n, long m) {
        int i = 0;
        int j = 0;
        /*
        Use two loops: The outer loop picks all the elements of arr2[] one by one. 
        The inner loop linearly searches for the element picked by the outer loop.
         If all elements are found then return 1, else return 0.

*/ 
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++)
                if (arr2[i] == arr1[j])
                    break;
 
            /* If the above inner loop
            was not broken at all then
            arr2[i] is not present in
            arr1[] */
            if (j == m)
                return false;
        }
 
        /* If we reach here then all
        elements of arr2[] are present
        in arr1[] */
        return true;
    }

    public static void main(String[] args) {
        long a1[] = {1, 2, 3, 4, 5, 6};
        long a2[] = {0, 9, 8};
        long n = a1.length;
        long m = a2.length;
        System.out.println(isSubset(a1,a2,n,m)); 
    }
}