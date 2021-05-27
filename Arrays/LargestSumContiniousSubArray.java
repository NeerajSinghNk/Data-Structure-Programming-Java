public class LargestSumContiniousSubArray {
    
   public static int maxSubarraySum(int arr[], int n){
        
        int maxSum =  Integer.MIN_VALUE;
        int max=0;
        for(int i=0;i<n;i++){
            max +=arr[i];

            if(max < arr[i]){
                max = arr[i];
            }
            if(maxSum < max){
                maxSum = max;
            }
        }

        return maxSum;
    }

    public static void main(String ar[]){
        int[] arr = {1,2,3,-2,5};
        int n = arr.length;
        System.out.println(maxSubarraySum(arr,n));
    }
}