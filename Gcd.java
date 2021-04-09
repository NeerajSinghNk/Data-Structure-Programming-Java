public class Gcd {
    public static void main(String[] args) {
        System.out.println(findGcd(10, 15));
    }

    static int findGcd(int a, int b){
        // if(b==0) return 0;
        // return findGcd(b,a%b);

        return a%b==0 ? b:findGcd(b, a%b);
    }
}