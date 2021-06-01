public class LongestIncreasingSubsequence {
    static int lis(int n, int[] arr){
        int[] dp = new int[n];
        int i,j,max=0;
        for(i=0;i<n;i++){
            dp[i] = 1;
        }

        for(i=1;i<n;i++){
            for(j=0;j<i;j++){
                if(arr[i] > arr[j] && dp[i] < dp[j]+1){
                    dp[i] = dp[j]+1;
                }
            }
        }
        for(i=0;i<n;i++){
            if(max < dp[i]){
                max = dp[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int A[] = {5,8,3,7,9,1};
        int n = A.length;
        System.out.println(lis(n,A));
    }
}