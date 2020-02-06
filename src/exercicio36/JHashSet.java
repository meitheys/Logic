package exercicio36;

import java.util.HashSet;
import java.util.Scanner;

public class JHashSet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        //HashSet impede a inserção de valores duplicados ou nulos.
        HashSet<String> sesh = new HashSet<String>();

        for (int i = 0; i < t; i++) {
            sesh.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(sesh.size());
            //Teste p/ ver inserção -> System.out.println(sesh);
        }

        /* Errado
        //HashSet impede a entrada de elementos duplicados e nulos
        //Começando do 0 pois o HackerRank quer desde o 1 só
        for (int c = 1; c < t; c++) {
            HashSet<String[]> seshR = new HashSet<>();
            HashSet<String[]> seshL = new HashSet<>();

            seshR.add(pair_right);
            seshL.add(pair_left);

            System.out.println(c);
        }*/
    }
}