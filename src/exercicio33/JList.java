package exercicio33;

import java.util.LinkedList;
import java.util.Scanner;

public class JList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        LinkedList<Integer> array = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int value = scan.nextInt();
            array.add(value);
        }

        int n2 = scan.nextInt();

        for (int i = 0; i < n2; i++) {
            String ac = scan.next();
            if (ac.equals("Insert")) {
                int ix = scan.nextInt();
                int val = scan.nextInt();
                array.add(ix, val);
            } else {
                int index = scan.nextInt();
                array.remove(index);
            }
            }
            scan.close();
            for (Integer x : array) {
                System.out.print(x + " ");
            }
        }
    }