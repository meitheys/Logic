package exercicio49;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExceptions {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int firstInt = scanner.nextInt();
            int secondInt = scanner.nextInt();

            if (secondInt == 0)
                throw new ArithmeticException("/ by zero");
            else
                System.out.println(firstInt / secondInt);

        } catch (InputMismatchException iE) {
            System.out.println(iE.getClass().getName());

        } catch (ArithmeticException aE) {
            System.out.println(aE);
        }
    }
}