/*
Factorial of a non-negative integer, is the multiplication of all integers smaller than or equal to n.
 For example factorial of 6 is 6*5*4*3*2*1 which is 720.
*/

import java.math.BigInteger;

public class FactorialOfLargeNumber {
    static BigInteger fact(int n){
        BigInteger f = new BigInteger("1");

        for(int i=2;i<n;i++){
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }

    public static void main(String args[]){
        int n=7;
        System.out.println("Large No. Factorial "+fact(n));
    }
}