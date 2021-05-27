public class PalindromicArray {
    public static int palinArray(int[] a, int n)
    {   
        boolean ans;
        for(int i=0;i<n;i++){
            ans = isPalinDrom(a[i]);
            if(!ans){
                return 0;
            }
        }
        return 1;
    }

    static boolean isPalinDrom(int n){
        int x = n;
        int rev =0;
        while(x!=0){
            int a = x%10;
            rev = rev*10+a;
            x/=10;
        }
        if(rev == n){
            return true;
        }
        else{return false;}
    }

    public static void main(String[] args) {
        int arr[] = {111 ,222 ,333 ,444, 555};
        int n = arr.length;
        System.out.println(palinArray(arr,n));
    }
}