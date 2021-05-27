/*
Given an array Arr that contains N integers (may be positive, negative or zero).
 Find the product of the maximum product subarray.
*/ 

public class MaximumProductSubarray {
    static int maxProductSubArray(int[] arr){
       int maxVal = arr[0];
       int minVal = arr[0];
       int productVal = arr[0];

       for(int i=1;i<arr.length;i++){

            if(arr[i]<0){
                int temp = maxVal;
                maxVal = minVal;
                minVal = temp;
            }

            maxVal = Math.max(arr[i],maxVal*arr[i]);
            minVal = Math.min(arr[i], minVal*arr[i]);

            productVal = Math.max(productVal,maxVal);

       }
       return productVal;
    }
    public static void main (String[] args)
    {
        int arr[] = { -1, -3, -10, 0, 60 };
        // int n = arr.length;
    
        System.out.println( "Maximum Subarray product is "
                                    + maxProductSubArray(arr));
    }
}