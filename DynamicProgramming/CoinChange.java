public class CoinChange {
    static long coinChange(int[] arr, int sum ,int n){
        long[][] dp = new long[n+1][sum+1];
        for(int i=0;i<=sum;i++){
            dp[0][i] = 0;
        }
        for(int i=0;i<=n;i++){
            dp[i][0] = 1;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                dp[i][j] = dp[i-1][j];
                if(j>= arr[i-1]){
                    dp[i][j] += dp[i][j-arr[i-1]]; 
                }
            }
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int sum=5;
        int n = arr.length;
        System.out.println(coinChange(arr,sum,n));
    }
}