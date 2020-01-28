package exercicio07;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DataType {

    static String whoCanFitTheNumber(String numString) {
        String var = "";
        try {
            long num = Long.parseLong(numString);
            var = numString + " can be fitted in:\n";
            if ((num <= Byte.MAX_VALUE) && (num >= Byte.MIN_VALUE)) {
                var = var.concat("* byte\n* short\n* int\n* long");
            } else if ((num <= Short.MAX_VALUE) && (num >= Short.MIN_VALUE)) {
                var = var.concat("* short\n* int\n* long");
            } else if ((num <= Integer.MAX_VALUE) && (num >= Integer.MIN_VALUE)) {
                var = var.concat("* int\n* long");
            } else {
                var = var.concat("* long");
            }
        } catch (NumberFormatException e) {
            var = numString + " can't be fitted anywhere.";
        }
        return var;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTestCases = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numTestCases; i++) {
            String numString = scanner.nextLine();
            System.out.println(whoCanFitTheNumber(numString));
        }
    }
}

