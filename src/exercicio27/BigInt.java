package exercicio27;

import java.math.BigInteger;
import java.util.Scanner;

public class BigInt {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        BigInteger b1 = new BigInteger(sn.next());
        BigInteger b2 = new BigInteger(sn.next());
        BigInteger  b3, b4;
        b3 = b1.add(b2);
        b4 = b1.multiply(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}
