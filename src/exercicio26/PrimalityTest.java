package exercicio26;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //String n = scanner.nextLine();
        BigInteger bi = new BigInteger(scanner.next());

        scanner.close();
        System.out.println(bi.isProbablePrime(10)?"prime":"not prime");
    }
}
