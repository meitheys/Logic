package exercicio14;

import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {

        //Goal: get a string and two ints, the ints say which number should we start to print and which number should we stop

        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        String substringado = S.substring(start, end);
        System.out.println(substringado);
    }
}
