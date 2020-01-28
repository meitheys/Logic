package exercicio12;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Formatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();

//        DecimalFormat df = new DecimalFormat("##,###.00");

//        double u = payment;
//            String uF = df.format(u);
//                String us =  uF;
//        double i = payment;
//            String iF = df.format(i);
//                String india =  uF;
//        double c = payment;
//            String cF = df.format(c);
//                String china =  uF;
//        double f = payment;
//            String fF = df.format(f);
//                String france =  fF;
//
//              Or easier, below:

        NumberFormat usF = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat cnF = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat frF = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat inF = NumberFormat.getCurrencyInstance(new Locale("en", "in"));

        String us = usF.format(payment);
        String china = cnF.format(payment);
        String france = frF.format(payment);
        String india = inF.format(payment);

        scanner.close();

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
