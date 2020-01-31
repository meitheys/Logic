package exercicio32;

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

    3 + 1 = 4 != 6, then it's NO.

    */




//    public static boolean canWin(int leap, int[] game) {
//        if(leap ){
//
//        }
//    }

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

            //System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}

