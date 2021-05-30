public class KnapsackWithDuplicateItems {
    static int knapSackDuplicate(int w, int[] wt, int[] val, int n){

        int dp[] = new int[w+1];
        for(int i=0;i<=w;i++){
            for(int j =0;j<n;j++){
                if(i>= wt[j]){
                    dp[i] = Math.max(dp[i], dp[i-wt[j]]+val[j]); 
                }
            }
        }
        return dp[w];
    }

    public static void main(String[] args) {
        int w = 100;
        int val[] = {10, 30, 20};
        int wt[] = {5, 10, 15};
        int n = val.length;
        System.out.println(knapSackDuplicate(w,wt,val,n));
    }
}