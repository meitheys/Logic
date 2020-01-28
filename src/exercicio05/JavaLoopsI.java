package exercicio05;

import java.util.Scanner;

public class JavaLoopsI {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //Inicializando o 'I' como 1 ele ignora o valor 0 que não pede no exercicio, adicionado [<'='] no loop faz ele ir até o 10
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
        scanner.close();
    }
}

