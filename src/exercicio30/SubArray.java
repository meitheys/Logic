package exercicio30;

import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {

        /*   X -->
                0 | 1 | 2 | 3 | 4 | 5 |
             0
             1     -2
             2
             3             -5
             4
             5

         */

        //A soma de um array é o total dos elementos do mesmo
        //

        Scanner scanner = new Scanner(System.in);
        int contagemDoValorDoArray = 0;
        int tantosDeVezesQueSeraRepitidoOScanner = scanner.nextInt();
        int[] a = new int[tantosDeVezesQueSeraRepitidoOScanner];

        // -BASE- Popula o array ---------|
        for (int i = 0; i < tantosDeVezesQueSeraRepitidoOScanner; i++)
            a[i] = scanner.nextInt();
        // -------------------------------|

        int contagem=0;
        for(int c=0; c < tantosDeVezesQueSeraRepitidoOScanner; c++){
            for(int k=c; k<tantosDeVezesQueSeraRepitidoOScanner; k++){
                contagemDoValorDoArray=a[k]+contagemDoValorDoArray;
                if(contagemDoValorDoArray<0){
                    contagem++;
                }
            }
            System.out.println(contagem);
        }

    }
}