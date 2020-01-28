package exercicio08;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class EOF {

    public static void main(String[] args){

        //Scanner base to Stdin the Strings
        Scanner scan = new Scanner(System.in);
        int i = 1;
        //Enquanto houver próxima linha
        while(scan.hasNextLine()){
            //Scaneia próxima linha
            String str = scan.nextLine();
            //Se linha == vazia, quebra loop;
            if(str.isEmpty())
                break;
            //Stdout
            System.out.println(i + " " + str);
            //Change the variable after every loop
            i++;
        }
    }
}
