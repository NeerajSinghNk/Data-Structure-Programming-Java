public class TrailingZero {
    static int trailingZero(int n){
        int res=0;
        for(int i=5;i<=n;i=i*5){
            res = res+n/i;
        }
        return res;
    }

    public static void main(String args[]){
        System.out.println(trailingZero(20));
    }
}


/*Here we can count no of traling zeros of any factorial
20 number has 4 trailing zeros
*/