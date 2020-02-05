package exercicio32;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

import java.util.Arrays;
import java.util.IllegalFormatConversionException;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.CancellationException;

public class Array1D2 {
    public static boolean canWin(int leap, int[] game, int i) {

        boolean flag = false;

        //Regras do HackerRank
        if (leap < 0 || leap > 100) {
            throw new IllegalArgumentException("Leap não deve ser menor que 0 ou maior que 100");
        }
        if (game.length < 1 || game.length > 100) {
            throw new IllegalArgumentException("O tamanho do Array não deve ser menor que 1 ou maior que 100");
        }

        if (i < 0 || game[i] == 1) {
            return false;
        }

        if (i + 1 >= game.length || i + leap >= game.length) {
            return true;
        }

        game[i] = 1;

        //Recursividade, vai tentando chamar o método ate conseguir, se não retorna false
        return canWin(leap, game, i + leap) || canWin(leap, game, i + 1) || canWin(leap, game, i - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Leap
        int q = scan.nextInt();

        //Regra
        if (q > 5000 || q < 1) {
            throw new IllegalArgumentException("O numero de registros não deve ser menor que um e nem maior que 5000");
        }

        //Preenchendo os dados
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
            System.out.println((canWin(leap, game, 0)) ? "YES" : "NO");
        }
        scan.close();
    }
}