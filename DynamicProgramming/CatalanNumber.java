/*
Catalan numbers are a sequence of natural numbers that occurs in many interesting counting problems 
like following.

Count the number of expressions containing n pairs of parentheses which are correctly matched.
 For n = 3, possible expressions are ((())), ()(()), ()()(), (())(), (()()).
Count the number of possible Binary Search Trees with n keys (See this)
Count the number of full binary trees (A rooted binary tree is full if every vertex has either two 
children or no children) with n+1 leaves.
Given a number n, return the number of ways you can draw n chords in a circle with 2 x n points such
 that no 2 chords intersect.

 The first few Catalan numbers for n = 0, 1, 2, 3, … are 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, …  
*/ 
public class CatalanNumber {
    static int catlanNumber(int cat){
        int[] dp = new int[cat+2];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=cat;i++){
            dp[i] = 0;
            for(int j=0;j<i;j++){
                dp[i] += dp[j]*dp[i-j-1];
            }
        }
        return dp[cat];
    }
public static void main(String[] args) {
    for(int cat=0;cat<10;cat++){
        System.out.print(catlanNumber(cat)+" ");
    }
}
}