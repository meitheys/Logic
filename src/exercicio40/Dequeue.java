package exercicio40;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class Dequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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
                System.out.println(deque + " < - deque");
                System.out.println(sesh + " <- Sesh");
                System.out.println(deque.size() + " < - Size of the deque");    //Take it out when starting the code
                System.out.println(sesh.size() + " <- Size of the Sesh");       //Take it out too.
                if (sesh.size() > maxV) maxV = sesh.size();
                int p = deque.remove();
                System.out.println(p + " <-- P");
                if (!deque.contains(p)) sesh.remove(p);
            }
        }
        System.out.println(maxV);
    }
}