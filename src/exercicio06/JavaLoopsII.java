package exercicio06;

import java.util.Scanner;

public class JavaLoopsII {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int tV = a;

            for (int j = 0; j < n; j++) {
                //tV += 2 + 0 * 1 = 2
                //tV += 2 + 1 * 2 = 6
                //...
                tV += (Math.pow(2, j) * b);
                System.out.print(tV + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
