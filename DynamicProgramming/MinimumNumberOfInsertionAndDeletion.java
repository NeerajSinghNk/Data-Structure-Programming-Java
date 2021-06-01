public class MinimumNumberOfInsertionAndDeletion {
    static int lcs(int x, int y, String s1, String s2){
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
    static void printMinDelAndInsert(String s1,
    String s2)
    {
        int x = s1.length();
        int y = s2.length();

        int len = lcs(x,y,s1,s2);

        System.out.println("Minimum number of "
        + "deletions = ");
        System.out.println(x - len);

        System.out.println("Minimum number of "
        + "insertions = ");
        System.out.println(y - len);
    }

    public static void main(String[] args) {
        String s1 = "heap";
        String s2 = "pea";
        // int x = s1.length();
        // int y = s2.length();
        printMinDelAndInsert(s1,s2);
    }
}