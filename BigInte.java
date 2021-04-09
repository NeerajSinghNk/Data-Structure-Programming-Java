import java.lang.*;
import java.math.BigInteger;
import java.util.*;

public class BigInte {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        if(isPrime(a)){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
    
    public static boolean isPrime(int a){
        BigInteger bigInteger = BigInteger.valueOf(a);
    
        if(bigInteger.isProbablePrime(0)){
            return true;
        }
        else{return false;}
    }
}