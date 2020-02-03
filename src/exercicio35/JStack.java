package exercicio35;

import java.util.Scanner;

public class JStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();

            //This regex matches "[],{},()"
            //Se tiver algum espaço em branco == false, 'cause '.isEmpty' catches it
            while(input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
            System.out.println(input.isEmpty());
        }
    }
}