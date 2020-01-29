package exercicio19;

import java.util.Scanner;
import java.util.regex.*;

public class SyntaxCheck {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            //Com isso ele entende que tem que parar o loop conforme o usuario informe um numero de linhas, não sei porque mas sem isso ele se perde.
            testCases--;
            try
            {
                //O pattern faz com que as sintaxes tenham que ser certas. Ex: "ab(" será errado pois os parenteses não foram fechados corretamente.
                Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch (Exception e)
            {
                System.out.println("Invalid");
            }
        }
    }
}