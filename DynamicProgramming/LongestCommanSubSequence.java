public class LongestCommanSubSequence {
    // Recursion Method
    static int lcs1(int x, int y, String s1, String s2){
        if(x==0 || y==0){
            return 0;
        }
        if(s1.charAt(x-1) == s2.charAt(y-1)){
            return 1+lcs1(x-1,y-1,s1,s2);
        }
        else{
            return Math.max(lcs1(x-1,y,s1,s2), lcs1(x,y-1,s1,s2));
        }
    }

    // Memorization DP code
    static int lcs2(int x, int y, String s1, String s2){
        int[][] dp = new int[x+1][y+1];
        for(int i=0;i<x+1;i++){
            for(int j=0;j<y+1;j++){
                dp[i][j] = -1;
            }
        }

        if(x==0 || y==0){
            return 0;
        }
        if(s1.charAt(x-1) == s2.charAt(y-1)){
            return dp[x][y] = 1+lcs2(x-1,y-1,s1,s2);
        }
        else{
            return dp[x][y] = Math.max(lcs2(x-1,y,s1,s2), lcs2(x,y-1,s1,s2));
        }

    }

    // Top-Down Dp code
    static int lcs3(int x, int y, String s1, String s2){
        int[][]dp = new int[x+1][y+1];
        for(int i=0;i<x+1;i++){
            for(int j=0;j<y+1;j++){
               if(i==0 || j==0){
                dp[i][j] = 0;
               }
            }
        }

        for(int i=1;i<x+1;i++){
            for(int j=1;j<y+1;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[x][y];

    }
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        int x = s1.length();
        int y = s2.length();
        System.out.println("Recursion O/P-> "+ lcs1(x,y,s1,s2));
        System.out.println("Memorization O/P-> "+lcs2(x,y,s1,s2));
        System.out.println("Top Down Approach O/P-> "+lcs3(x,y,s1,s2));
    }
}