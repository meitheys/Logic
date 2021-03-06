package exercicio34;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JMap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        Map<String, Integer> mapping = new HashMap<String, Integer>();

        //Preenche dados
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            mapping.put(name, phone);
        }
        //Getta dados
        while (in.hasNext()) {
            //Pega String no Map, nome
            String s = in.nextLine();
            try {
                //Pega int no map, numero
                int temp = mapping.get(s);
                System.out.println(s + "=" + temp);
            } catch (NullPointerException e) {
                System.out.println("Not found");
            }
        }
    }
}