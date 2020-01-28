package exercicio15;

import java.util.Scanner;

public class SubstringCompariosons {

    //Goal: Separar a cada 3 letras e colocar em ordem alfabetica

    public static String getSmallestAndLargest(String s, int k) {
        String test = s.substring(0,k);
        String smallest = "";
        String largest = "";


        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}
