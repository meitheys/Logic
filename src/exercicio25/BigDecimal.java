package exercicio25;

import java.util.Arrays;
import java.util.Scanner;

public class BigDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        Arrays.sort(s, (number1, number2) -> new BigDecimal(number2)
                .compareTo(new BigDecimal(number1)));

        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
        sc.close();
    }
}
