package exercicio28;

import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        //Criando Array 1D Básico.
        int[] a = new int[n];

        //Loopando para cada Scanner ser add no Array.
        for(int i=0;i<n;i++)
            a[i] =  scan.nextInt();

        scan.close();

        //Loopando o Array para imprimir cada item dentro do mesmo.
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}



