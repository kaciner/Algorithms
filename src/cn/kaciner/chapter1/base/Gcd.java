package cn.kaciner.chapter1.base;

/**
 * @author Bowen Du
 * @since 2021-01-13 00:33
 */

public class Gcd {
    //欧几里得算法 辗转相除求最大公约数
    public static int gcd(int p, int q) {
        if(q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }



    public static void main(String[] args) {
        int gcd = Gcd.gcd(15, 5);
        System.out.println(gcd);
    }
}
