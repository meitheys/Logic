package exercicio31;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*

        Input

        5 | 41 77 74 22 44
        1 | 12
        4 | 37 34 36 52
        0 |
        3 | 20 22 33

        What's asked to we get

        1 3
        3 4
        3 1
        4 3
        5 5

        It's like

                1    2    3    4    5
       1 ->     41  77   74   22   44
       2 ->     12
       3 ->     37  34   36   52
       4 ->
       5 ->     3   20   22   33

       But in array, it initialize in 0, so it's like

                 0    1    2    3    4
       0 ->     41  77   74   22   44
       1 ->     12
       2 ->     37  34   36   52
       3 ->
       4 ->     3   20   22   33

        */

        List<List<Integer>> lines = new ArrayList<List<Integer>>();
        int n = in.nextInt();
        //Preenche o Array
        for (int i = 0; i < n; i++) {
            List<Integer> line = new ArrayList<Integer>();
            int d = in.nextInt();
            for (int j = 0; j < d; j++) {
                line.add(in.nextInt());
            }
            lines.add(line);
        }
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            //Se X estiver vazio quer dizer que não há nada para pegar, retornando erro
            // -1 pois o array inicia em 0, ou seja, quando a pessoa pedir (1, 3), na verdade é 0, 2.
            if (y > lines.get(x - 1).size()) {
                System.out.println("ERROR!");
            } else {
                System.out.println(lines.get(x - 1).get(y - 1));
            }
        }
        in.close();
    }
}