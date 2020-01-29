package exercicio18;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Token {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if (s.trim().isEmpty()) {
            System.out.println(0);
        } else {


            //Regras REGEX
            // '/' simboliza seguir as regras
            // '^' simboliza começo do texto
            // '$" simboliza o final do texto
            // '*' simboliza que a expressão será executada repetidamente
            // '+' acha mais de uma occorencia | ex: '/a+/" corresponderá a todos os 'a' de candy assim como de caaaaaandy.
            // '?' simboliza que a expressão será executado 0 ou 1x
            //... {https://developer.mozilla.org/pt-BR/docs/Web/JavaScript/Guide/Regular_Expressions}

            String[] splitString = (s.replaceAll("^\\W+", "").split("[\\s!,?._'@]+"));
//            String[] splitString = (s.replaceAll("^[\\W+\\s+]", "").split("[\\s!,?._'@]+")); <------------ ERRADO
//            String[] arrSr = s.split(" ",100);

            System.out.println(splitString.length);
            for (String a : splitString)
                System.out.println(a);

            scan.close();
        }
    }
}
