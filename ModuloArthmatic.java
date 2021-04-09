public class ModuloArthmatic {
    public static void main(String[] args) {
        System.out.println(commanFactor(3, 5));    
    }

    // static long fastPower(long a, long b , long n ){
    //     long res = 1;
    //     while(b >= 0){

    //         if((b & 1) !=0 ){
    //             res = (res * a % n)%n;
    //         }
    //         a = (a%n * a%n)%n;
    //         b = b>>1;
    //     }

    //     return res;
    // }
    static int commanFactor(int a, int b){
        int res=1;
        while(b>0){
            if((b&1) !=0){
                res = res*a;
            }
            a = a*a;
            b = b>>1;
        }
        return res;
    }
}