package exercicio09;

import java.util.Scanner;

public class InitializerBlockStaticVariables {
    //Criação das variaveis staticas
    private static int B;
    private static int H;
    private static boolean flag;

    //Static faz um método estático, fazendo ele se extender para todas os outros métodos da Classe!
    static {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        } else
            flag = true;
    }


    public static void main(String[] args){
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}
