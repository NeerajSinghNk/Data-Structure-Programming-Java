public class MaxSumContiguousSubarray {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int max = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<A.size();i++){
            max += A.get(i);
            if(max<A.get(i)){
                max = A.get(i);
            }
            if(maxSum < max){
                maxSum = max;
            }
        }
        return maxSum;
    }
}
