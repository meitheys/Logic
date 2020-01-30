package exercicio32;

import java.util.Scanner;

public class Array1D2 {
    public static boolean canWin(int leap, int[] game) {
        if(leap ){

        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Leap
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}

