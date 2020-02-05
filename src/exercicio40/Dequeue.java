package exercicio40;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class Dequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*

        5 3 5 2 3 2

        5
         3
          5
           2
            3
             2

        5 3
           3 5
             5 2
                2 3
                  3 2

       5 3 5
            3 5 2
                 5 2 3
                      2 3 2

       5 3 5 2
              3 5 2 3
                     5 2 3 2

        5 3 5 2 3
                 3 5 2 3 2

        5 3 5 2 3 2

        */

        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> sesh = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();
        int maxV = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            sesh.add(num);

            if (deque.size() == m) {
                if (sesh.size() > maxV) maxV = sesh.size();
                //Remove 'P' do deque e coloca o mesmo em uma variavel,
                int p = deque.remove();
                //Se 'P' não existe mais no Deque, remove p
                if (!deque.contains(p)) sesh.remove(p);
            }
        }
        System.out.println(maxV);
    }
}