public class KnapsackProblem {
    
    static int knapSack(int w, int[] wt, int[] val, int n){
        int [][] dp = new int[n+1][w+1];

        for(int i=1;i<n+1;i++){
            for(int j=1;j<w+1;j++){
                if(wt[i-1] <= j){
                    dp[i][j] = Math.max(val[i-1]+dp[i-1][j-wt[i-1]], dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][w];
    }

    public static void main(String[] args) {
        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int w = 50;
        int n = val.length;
        System.out.println(knapSack(w,wt,val,n));
    }
}