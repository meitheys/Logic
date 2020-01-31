package exercicio36;

import java.util.Arrays;
import java.util.Scanner;

public class JHashSet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        System.out.println(Arrays.toString(pair_left));
        System.out.println(Arrays.toString(pair_right));

    }
}

