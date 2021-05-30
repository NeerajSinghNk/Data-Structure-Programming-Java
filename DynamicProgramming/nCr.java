public class nCr {
    static int binomial_nCr(int n, int r){

        int[][] dp = new int[n+1][r+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=Math.min(i,r);j++){
                if(j==0 || j==i){
                    dp[i][j] = 1;
                }
                else{
                    dp[i][j] = (dp[i-1][j-1] + dp[i-1][j])%1000000007;
                }
            }
        }

        return dp[n][r]%1000000007;
    }
    public static void main(String[] args) {
        int n =778, r = 116;
        System.out.println(binomial_nCr(n,r));
    }
}