package exercicio02;

import java.util.Scanner;

public class IfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Variable that will receive the value
        String msg = "";

        Scanner print = new Scanner(System.in);
        int i = print.nextInt();

        if (i % 2 == 1) {
            msg = "Weird";
        } else {
            if (i >= 2 && i <= 5) {
                msg = "Not Weird";
            } else if (i >= 6 && i <= 20) {
                msg = "Weird";
            } else {
                msg = "Not Weird";
            }
        }
        System.out.println(msg);
    }
}
