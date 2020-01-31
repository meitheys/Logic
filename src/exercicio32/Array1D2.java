package exercicio32;

import java.util.Arrays;
import java.util.Scanner;

public class Array1D2 {

    //What to

    /*
    Ex of input

    1 <---Base of how many lines will be put
    6 <--- [6] Units that will be input in the array 5 <-- [5] is the Leap
        ^ Explanation ->
                        0  <-- 1
                        0  <-- 2
                        0  <-- 3
                        1  <-- 4
                        1  <-- 5
                        1  <-- 6, so [6] six is the size of the array

    0 0 0 1 1 1

    So, if Leap + index = units of the end of the array
            5   +   1   = 6
    ^^ That's a 'YES' 'cause:

    Another example:

    6 3
    0 0 1 1 1 0

    3 + 1 = 4 != 6, then we say NO

    */

    /* INPUT

    2 <--- Number os inputs
    5 3
    0 0 0 0 0

    6 5
    0 0 0 1 1 1

     */

    //Q is the Leap
    //We need to achieve to game.length

    public static boolean canWin(int leap, int[] game, int i) {
        //Se tudo for zero
        if (i < 0 || game[i] == 1)
            return false;
        if (i + 1 >= game.length || i + leap >= game.length)
            return true;

        game[i] = 1;

        return canWin(leap, game, i + leap) || canWin(leap, game, i + 1) || canWin(leap, game, i - 1);
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
            System.out.println( (canWin(leap, game, 0)) ? "YES" : "NO" );
        }
        scan.close();
    }
}

