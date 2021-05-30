public class PermutationCoefficient {
    static int coefficient(int n, int k){
        int[][] dp = new int[n+2][k+2];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=Math.min(i,k);j++){
                if(j==0){
                    dp[i][j] = 1;
                }
                else{
                    dp[i][j] = dp[i-1][j] + (j* dp[i-1][j-1]);
                }
                dp[i][j+1] = 0;
            }
        }
        return dp[n][k];
    }
    public static void main(String[] args) {
        int n = 10, k =2;
        System.out.println(coefficient(n,k));
    }
}