public class LongestPalindromicSubSequence {
    static int  LPS(String seq){
        int n = seq.length();
        int[][] dp = new int[n][n];

        for(int i=0;i<n;i++){
            dp[i][i] = 1;
        }

        for(int c=2;c<=n;c++){
            for(int i=0;i<n-c+1;i++){
                int j = i+c-1;
                if(seq.charAt(i) == seq.charAt(j) && c==2){
                    dp[i][j] = 2;
                }
                else if(seq.charAt(i) == seq.charAt(j)){
                    dp[i][j] = 2+dp[i+1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }
        return dp[0][n-1];
    }

    public static void main(String[] args) {
        String seq = "agbcba";
        // int n = seq.length();
        System.out.println(LPS(seq));
    }
}